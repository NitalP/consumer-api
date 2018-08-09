#!/bin/bash

echo "Building project consumer-api:1.0"

name=consumer-api
version=1.0

if [ "$1" != "" ]; then
	name=$1
fi
if [ "$2" != "" ]; then
	version=$2
fi

docker build -t repository.cars.com/$name:$version .
