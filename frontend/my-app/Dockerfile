
FROM node as build
WORKDIR /app
COPY package*.json ./
RUN npm install
 
COPY . ./
 
ARG configuration=production
 
RUN npm run build -- --outputPath=./dist/out --configuration $configuration

FROM nginx

COPY --from=build /app/dist/out/ /usr/share/nginx/html
 
EXPOSE 80
 
ENTRYPOINT ["nginx","-g","daemon off;"]