package v1

import "fmt"

// https://github.com/dup2X/govsjava/wiki/Golang%E5%A6%82%E4%BD%95%E5%AE%9E%E7%8E%B0Java%E7%9A%84%E5%8A%A8%E6%80%81%E4%BB%A3%E7%90%86%E7%B1%BB%E5%8A%9F%E8%83%BD%EF%BC%9F
type V1 struct {
	Name string
	opt *option
}

type Option func(option *option)

type option struct {
	timeoutSec int64
	preFunc func()
	postFunc func()
}

func New(name string, options ...Option) *V1 {
	opt := &option{}
	for _, option := range options {
		option(opt)
	}
	v1 := &V1{Name: name}
	v1.opt = opt
	return v1
}

func (v1 *V1) Do() {
	fmt.Println("do before")
	if v1.opt.preFunc != nil {
		fmt.Println("run preFunc")
		v1.opt.preFunc()
	}
	if v1.opt.postFunc != nil {
		fmt.Println("run postFunc")
		v1.opt.postFunc()
	}
	fmt.Println("do after")
}
