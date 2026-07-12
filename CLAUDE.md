# new-qqq-application-template

Velocity-templated scaffold for new standalone QQQ applications, rendered by
`qctl qqq init` via the qqq-templates-hub registry (template id `new-qqq-application`).
Template sources live under `template/`; `scripts/customize_template.py` is a dead
legacy flow from the pre-Velocity layout.

## Knowledge base

- Domain hub: `R:/Git.Local/KofTwentyTwo/second-brain/knowledge/qqq/qqq-hub.md`
- Repo dossier: `R:/Git.Local/KofTwentyTwo/second-brain/knowledge/qqq/repos/new-qqq-application-template.md`
- Reviewed commit: `b09751887176` (branch `main`, 2026-07-04)

Key facts from the dossier: pinned `qqq-bom-pom:0.33.0-health-endpoints-bc5898783-SNAPSHOT`
and `qqq-frontend-material-dashboard:0.28.0-SNAPSHOT` both 404 on Central Portal Snapshots
(template unbuildable from clean); `template/pom.xml` and `template/mvnw` still carry
proprietary "Kof22" headers contradicting the Apache-2.0 LICENSE; pom targets Java 17 vs
the qqq 4.0 Java 21 floor.
