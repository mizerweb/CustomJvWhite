package defpackage;

import java.nio.charset.CodingErrorAction;

/* JADX INFO: loaded from: classes.dex */
public final class wia implements Cloneable {
    public CodingErrorAction a;
    public CodingErrorAction b;
    public int c;
    public int d;
    public int e;

    public final Object clone() {
        wia wiaVar = new wia();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        wiaVar.a = codingErrorAction;
        wiaVar.b = codingErrorAction;
        wiaVar.c = Integer.MAX_VALUE;
        wiaVar.d = 8192;
        wiaVar.e = 8192;
        wiaVar.a = this.a;
        wiaVar.b = this.b;
        wiaVar.c = this.c;
        wiaVar.d = this.d;
        return wiaVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wia)) {
            return false;
        }
        wia wiaVar = (wia) obj;
        return this.a == wiaVar.a && this.b == wiaVar.b && this.c == wiaVar.c && this.e == wiaVar.e && this.d == wiaVar.d;
    }

    public final int hashCode() {
        CodingErrorAction codingErrorAction = this.a;
        int iHashCode = (992 + (codingErrorAction != null ? codingErrorAction.hashCode() : 0)) * 31;
        CodingErrorAction codingErrorAction2 = this.b;
        return ((((((iHashCode + (codingErrorAction2 != null ? codingErrorAction2.hashCode() : 0)) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }
}
