package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class ou1 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ q8b b;

    public /* synthetic */ ou1(q8b q8bVar, int i) {
        this.a = i;
        this.b = q8bVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        q8b q8bVar = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return e9i.D(Integer.valueOf(q8bVar.c(Integer.MAX_VALUE, (fu1) obj)), Integer.valueOf(q8bVar.c(Integer.MAX_VALUE, (fu1) obj2)));
    }
}
