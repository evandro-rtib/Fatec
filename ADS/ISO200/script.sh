#!/bin/bash

#EXEMPLO DE CASE
while test 1 -eq 1
do
	echo "DIGITE UM NUMERO"

	read numero

	case $numero in
		1)
			echo "o numero que vc d igitou foi 1"
			;;
		2)	echo "esse e numero 2"
			;;
		3)	break
			;;
		*)	echo "digite 1 ou 2"
	esac
done
