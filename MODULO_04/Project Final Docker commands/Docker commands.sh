MAC:
# Contenedor principal
docker run \
  -p 5432:5432 \
  --name postgres-db \
  -e POSTGRES_USER=jira \
  -e POSTGRES_PASSWORD=JiraRush \
  -e POSTGRES_DB=jira \
  -e PGDATA=/var/lib/postgresql/data/pgdata \
  -v ./pgdata:/var/lib/postgresql/data \
  -d postgres

# Contenedor para pruebas
docker run \
  -p 5433:5432 \
  --name postgres-db-test \
  -e POSTGRES_USER=jira \
  -e POSTGRES_PASSWORD=JiraRush \
  -e POSTGRES_DB=jira-test \
  -e PGDATA=/var/lib/postgresql/data/pgdata \
  -v ./pgdata-test:/var/lib/postgresql/data \
  -d postgres
-----------------------------------------------------------------------------------------
# Windows(CMD):
REM Contenedor principal
docker run ^
  -p 5432:5432 ^
  --name postgres-db ^
  -e POSTGRES_USER=jira ^
  -e POSTGRES_PASSWORD=JiraRush ^
  -e POSTGRES_DB=jira ^
  -e PGDATA=/var/lib/postgresql/data/pgdata ^
  -v ./pgdata:/var/lib/postgresql/data ^
  -d postgres

REM Contenedor para pruebas
docker run ^
  -p 5433:5432 ^
  --name postgres-db-test ^
  -e POSTGRES_USER=jira ^
  -e POSTGRES_PASSWORD=JiraRush ^
  -e POSTGRES_DB=jira-test ^
  -e PGDATA=/var/lib/postgresql/data/pgdata ^
  -v ./pgdata-test:/var/lib/postgresql/data ^
  -d postgres

-----------------------------------------------------------------------------------------
# Windows(PowerShell):
# Contenedor principal
docker run `
  -p 5432:5432 `
  --name postgres-db `
  -e POSTGRES_USER=jira `
  -e POSTGRES_PASSWORD=JiraRush `
  -e POSTGRES_DB=jira `
  -e PGDATA=/var/lib/postgresql/data/pgdata `
  -v ./pgdata:/var/lib/postgresql/data `
  -d postgres

# Contenedor para pruebas
docker run `
  -p 5433:5432 `
  --name postgres-db-test `
  -e POSTGRES_USER=jira `
  -e POSTGRES_PASSWORD=JiraRush `
  -e POSTGRES_DB=jira-test `
  -e PGDATA=/var/lib/postgresql/data/pgdata `
  -v ./pgdata-test:/var/lib/postgresql/data `
  -d postgres
