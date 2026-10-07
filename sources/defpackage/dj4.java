package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dj4 implements ej4 {
    public final m8b a;

    public dj4(m8b m8bVar) {
        this.a = m8bVar;
    }

    public final dj4 a(dj4 dj4Var) {
        m8b m8bVar = this.a;
        int i = m8bVar.d;
        m8b m8bVar2 = dj4Var.a;
        m8b m8bVar3 = new m8b(i + m8bVar2.d);
        m8bVar3.b(m8bVar);
        m8bVar3.b(m8bVar2);
        return new dj4(m8bVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dj4) && this.a.equals(((dj4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Update(contactIds=" + this.a + ")";
    }
}
