package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e57 extends kih {
    public final long c;
    public final u8b d;
    public final List e;
    public final c9b f;

    public e57(long j, u8b u8bVar, List list, c9b c9bVar) {
        this.c = j;
        this.d = u8bVar;
        this.e = list;
        this.f = c9bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e57)) {
            return false;
        }
        e57 e57Var = (e57) obj;
        return this.c == e57Var.c && cqk.d(this.d, e57Var.d) && this.e.equals(e57Var.e) && cqk.d(this.f, e57Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + qv1.c((this.d.hashCode() + (Long.hashCode(this.c) * 31)) * 31, 31, this.e);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(folderSync=" + this.c + ", folders=" + this.d + ", foldersOrder=" + this.e + ", allFilterExcludeFolders=" + this.f + ")";
    }
}
