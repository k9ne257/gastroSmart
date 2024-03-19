FROM node:18-alpine

WORKDIR /gastrosmart-frontend/

COPY frontend/public/ /gastrosmart-frontend/public
COPY frontend/src/ /gastrosmart-frontend/src
COPY frontend/package.json /gastrosmart-frontend/

RUN npm install
COPY . .

EXPOSE 3000

CMD ["npm", "start"]