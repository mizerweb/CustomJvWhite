package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class y1 implements Iterator, uv8 {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public /* synthetic */ y1(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return this.b < ((b2) obj).getSize();
            case 1:
                return this.b < ((Object[]) obj).length;
            default:
                return this.b < ((ViewGroup) obj).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    qr7.d();
                    return null;
                }
                int i2 = this.b;
                this.b = i2 + 1;
                return ((b2) obj).get(i2);
            case 1:
                try {
                    int i3 = this.b;
                    this.b = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    ore.f(e.getMessage());
                    return null;
                }
            default:
                int i4 = this.b;
                this.b = i4 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i4);
                if (childAt != null) {
                    return childAt;
                }
                ore.i();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.c;
                int i = this.b - 1;
                this.b = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }
}
