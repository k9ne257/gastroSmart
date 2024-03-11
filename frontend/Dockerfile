FROM node:18-alpine

WORKDIR /gastrosmart-frontend/

COPY public/ /gastrosmart-frontend/public
COPY src/ /gastrosmart-frontend/src
COPY package.json /gastrosmart-frontend/

RUN npm install
COPY . .

EXPOSE 3000

CMD ["npm", "start"]