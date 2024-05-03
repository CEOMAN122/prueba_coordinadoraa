# prueba coordinadora


## Name
Proyecto coordinadora.

## Description
En este proyecto base puede encontrar diferentes casos de uso con las diferentes funcionalidades de Karate. Como: Config | Scenarios outline | Variables | Reutilización - Calls | Read | Matchers y fuzzy matching | Retry | Expresiones regulares | tables | JS functions | Java functions | Condicionales | Paralelización | print | Ejecución con Runners | Variables de entorno y ejecución desde consola.

## Consideraciones


## ✅ Technologies
### This project required:
- [JDK java] 
- [Karate] 
- [Gradle] 


## Project status
<h4 align="center"> 🚧 Proyecto en construcción 🚧 </h4> 

## Usage
Use examples liberally, and show the expected output if you can. It's helpful to have inline the smallest example of usage that you can demonstrate, while providing links to more sophisticated examples if they are too long to reasonably include in the README.

 command:

```
cd existing_repo
git remote add origin git branch -M develop
git push -uf origin develop
```

### Run con java jar
```
java -jar karate-1.4.0.jar <ruta_del_archivo.feature>

java -jar karate-1.4.0.jar -Dkarate.options="--config karate-config.js" -DbaseUrl=

java -jar karate-1.4.0.jar -Dkarate.options="--config karate-config.js" ruta_del_archivo.feature
```

#### ejemplo run con java jar

```
 java -jar karate-1.4.0.jar src/test/java/users/get/user-get.feature
 
```

### Run con gradle

```

 test --tests <nombre_de_clase>.<nombre_del_método> -D<propiedades_del_sistema>
 
 test --tests SampleTesClassRunner -DbaseUrl=https://reqres.in 
 
 test --tests SampleTesClassRunner.testTagsMethod -DbaseUrl=https://reqres.in 
 
 test -Dtest=SampleTesClassRunner#testTagsMethod
 
```

#### ejemplo run con gradle

```
 gradle test --tests ManagementUserTest.testParallel -DbaseUrl=https://reqres.in 
 
 gradle test --tests UserGetRunner -DbaseUrl=https://reqres.in 
 gradle test --tests UserGetRunner.userGet -DbaseUrl=https://reqres.in 
 
 gradle test -Dtest=UserGetRunner#userGet -DbaseUrl=https://reqres.in 
 
```

## Collaborate with your team

- [ ] [Invite team members and collaborators](https://docs.gitlab.com/ee/user/project/members/)
- [ ] [Create a new merge request](https://docs.gitlab.com/ee/user/project/merge_requests/creating_merge_requests.html)
- [ ] [Automatically close issues from merge requests](https://docs.gitlab.com/ee/user/project/issues/managing_issues.html#closing-issues-automatically)
- [ ] [Enable merge request approvals](https://docs.gitlab.com/ee/user/project/merge_requests/approvals/)
- [ ] [Automatically merge when pipeline succeeds](https://docs.gitlab.com/ee/user/project/merge_requests/merge_when_pipeline_succeeds.html)

## Test and Deploy

Use the built-in continuous integration in GitLab.

- [ ] [Get started with GitLab CI/CD](https://docs.gitlab.com/ee/ci/quick_start/index.html)
- [ ] [Analyze your code for known vulnerabilities with Static Application Security Testing(SAST)](https://docs.gitlab.com/ee/user/application_security/sast/)
- [ ] [Deploy to Kubernetes, Amazon EC2, or Amazon ECS using Auto Deploy](https://docs.gitlab.com/ee/topics/autodevops/requirements.html)
- [ ] [Use pull-based deployments for improved Kubernetes management](https://docs.gitlab.com/ee/user/clusters/agent/)
- [ ] [Set up protected environments](https://docs.gitlab.com/ee/ci/environments/protected_environments.html)

***

## Support
Tell people where they can go to for help. It can be any combination of an issue tracker, a chat room, an email address, etc.

## Roadmap
If you have ideas for releases in the future, it is a good idea to list them in the README.

## Author 
Manuel Cubides

## License
Open source project.


