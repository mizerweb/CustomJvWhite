package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class gw extends AbstractSet {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public gw(gri[] griVarArr) {
        this.b = griVarArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new jw((mw) obj);
            default:
                return new i98((gri[]) obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((mw) obj).c;
            default:
                return ((gri[]) obj).length / 2;
        }
    }

    public gw(mw mwVar) {
        this.b = mwVar;
    }
}
