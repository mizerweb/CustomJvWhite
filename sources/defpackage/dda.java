package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class dda implements Iterator, uv8 {
    public final /* synthetic */ int a;
    public Iterator b;
    public final Object c;

    public dda(eda edaVar) {
        this.a = 0;
        this.b = ((Iterable) edaVar.a.b).iterator();
        this.c = ((Iterable) edaVar.b.b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b.hasNext() && ((Iterator) this.c).hasNext();
            default:
                return this.b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new ylc(this.b.next(), ((Iterator) obj).next());
            default:
                Object next = this.b.next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                y1 y1Var = viewGroup != null ? new y1(2, viewGroup) : null;
                if (y1Var == null || !y1Var.hasNext()) {
                    while (!this.b.hasNext() && !arrayList.isEmpty()) {
                        this.b = (Iterator) ww3.B1(arrayList);
                        cx3.f1(arrayList);
                    }
                } else {
                    arrayList.add(this.b);
                    this.b = y1Var;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public dda(y1 y1Var) {
        this.a = 1;
        this.c = new ArrayList();
        this.b = y1Var;
    }
}
