#!/bin/bash

#Subir cosas a GitHub por la carísima cara.

 echo "Escribe el comentario salao"

 read texto

 git add . --all
 git commit -m "$texto"
 git push
