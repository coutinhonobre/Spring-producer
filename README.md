# Spring-producer

## criar o container rabbitmq docker
docker run -d -p 15672:15672 -p 5672:5672 --name rabbitmq rabbitmq:3-management

## acessar o bash do container
docker exec -i -t rabbitmq /bin/bash

## reabilitar mensagens da fila de error
rabbitmq-plugins enable rabbitmq_shovel rabbitmq_shovel_management

## na opção move messagens colocar
rk.producer.aula-spring


