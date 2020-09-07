package account

import "fmt"

// Static proxy + simple factory function
type Proxy struct {
	Account Account
}

func (p *Proxy) Query(id string) int {
	fmt.Println("Proxy.Query begin")
	val := p.Account.Query(id)
	fmt.Println("Proxy.Query end")
	return val
}

func (p *Proxy) Update(id string, val int) {
	fmt.Println("Proxy.Update begin")
	p.Account.Update(id, val)
	fmt.Println("Proxy.Update end")
}
