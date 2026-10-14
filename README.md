# templates

Templates e stack [StackSpot](https://stackspot.com) para criar apps Android já com estrutura, CI e padrões definidos.

## Conteúdo

| Pasta | O que gera |
|---|---|
| `android-compose/` | App Android em Jetpack Compose |
| `android-xml/` | App Android com Views/XML, com config do Horusec para análise de segurança |
| `stack.yaml` | Stack `brunocarvalhs-android`, que agrupa os templates |

## O que vem no projeto gerado

- `buildSrc` com versões, dependências e build types centralizados
- Módulo `commons` com tema (cores e shapes)
- GitHub Actions de build, testes e release
- Templates de issue (bug e feature) e de pull request
- `README.md` e `VERSION.md`

## Inputs

Na criação, o template pede o nome do projeto, o package (padrão `br.com.brunocarvalhs`) e o minSdk (padrão 21).
