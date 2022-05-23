# EShop demo application

## How to build source code?

```bash
make
```

## How to run this demo?

```bash
docker run -d --name demo \
  -p 80:8080 \
  [munu/liveproject-tracing](https://hub.docker.com/layers/219149821/munu/liverproject-tracing/v1.1/images/sha256-95b7c6a34cf444b2eb709a8d8b21ea887a8f373d505f38f51b0a212c5a28bbdd?context=repo)
```

## Test the demo

Use curl command or open url ```127.0.0.1/checkout``` in the browser. You should be able to see output as the followings.

```bash
➜  milestone1 git:(master) ✗ curl 127.0.0.1/checkout
You have successfully checked out your shopping cart.
```
