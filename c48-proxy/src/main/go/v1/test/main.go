package main

import "code-design/c48-proxy/src/main/go/v1"

func main() {
	var option1 = v1.Option(nil)
	var option2 = v1.Option(nil)
	v := v1.New("roy", option1, option2)
	v.Do()
}
