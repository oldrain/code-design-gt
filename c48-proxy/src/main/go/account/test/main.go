package main

import "code-design/c48-proxy/src/main/go/account"

func main() {
	id := "10011"
	a := account.New(id, "roy", 100)
	a.Query(id)
	a.Update(id, 500)
}

func init() {
	account.New = func(id, name string, val int) account.Account {
		a := &account.AccountImpl{
			Id: id,
			Name: name,
			Value: val,
		}
		p := &account.Proxy{
			Account: a,
		}
		return p
	}
}
