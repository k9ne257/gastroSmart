#FROM node:13.12.0-alpine
#
## set working directory
#WORKDIR /app
#
## add `/app/node_modules/.bin` to $PATH
#ENV PATH /app/node_modules/.bin:$PATH
#
## install app dependencies
#COPY package.json ./
#COPY package-lock.json ./
#RUN npm install --silent
#RUN npm install react-scripts@3.4.1 -g --silent
#
## add app
#COPY . ./
#
## start app
#CMD ["npm", "start"]

FROM node:18-alpine

WORKDIR /gastrosmart-frontend/

COPY public/ /gastrosmart-frontend/public
COPY src/ /gastrosmart-frontend/src
COPY package.json /gastrosmart-frontend/

RUN npm install
COPY . .

EXPOSE 3000

CMD ["npm", "start"]