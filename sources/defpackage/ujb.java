package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ujb extends kih {
    public final long c;
    public final u8b d;
    public final List e;
    public final c9b f;

    public ujb(long j, u8b u8bVar, List list, c9b c9bVar) {
        this.c = j;
        this.d = u8bVar;
        this.e = list;
        this.f = c9bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujb)) {
            return false;
        }
        ujb ujbVar = (ujb) obj;
        return this.c == ujbVar.c && cqk.d(this.d, ujbVar.d) && this.e.equals(ujbVar.e) && cqk.d(this.f, ujbVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + qv1.c((this.d.hashCode() + (Long.hashCode(this.c) * 31)) * 31, 31, this.e);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(folderSync=" + this.c + ", folders=" + this.d + ", foldersOrder=" + this.e + ", allFilterExcludeFolders=" + this.f + ")";
    }
}
