package defpackage;

import one.me.sdk.database.DbCorruptionException;

/* JADX INFO: loaded from: classes.dex */
public final class gs3 extends qre {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ gs3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.qre
    public void a(id7 id7Var) throws DbCorruptionException {
        switch (this.a) {
            case 1:
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "Database", zo5.h(id7Var.a.getVersion(), "onDestructiveMigration "), null);
                    }
                }
                ((w6c) this.b).f.b(1);
                break;
        }
    }

    @Override // defpackage.qre
    public final void b(id7 id7Var) {
        switch (this.a) {
            case 0:
                id7Var.l();
                try {
                    StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                    ((lhb) this.b).getClass();
                    sb.append(System.currentTimeMillis() - 86400000);
                    sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                    id7Var.I(sb.toString());
                    id7Var.o0();
                    return;
                } finally {
                    id7Var.E();
                }
            default:
                if (id7Var.P()) {
                    id7Var.I("PRAGMA synchronous = NORMAL");
                    return;
                }
                return;
        }
    }
}
