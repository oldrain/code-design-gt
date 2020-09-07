package main

import "fmt"

func main() {
	saveUser(&user{"roy"})
}

type user struct {
	Name string
}

func (u *user) String() string {
	return u.Name
}

func saveUser(u *user) {
	withTx(func() {
		fmt.Println("save: " + u.Name)
	})
}

func withTx(f func()) {
	fmt.Println("begin")
	f()
	fmt.Println("end")
}
