package defpackage;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class w97 implements l78 {
    public final l78 b;
    public final Object a = new Object();
    public final HashSet c = new HashSet();

    public w97(l78 l78Var) {
        this.b = l78Var;
    }

    @Override // defpackage.l78
    public final Image H0() {
        return this.b.H0();
    }

    public final void b(v97 v97Var) {
        synchronized (this.a) {
            this.c.add(v97Var);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        HashSet hashSet;
        this.b.close();
        synchronized (this.a) {
            hashSet = new HashSet(this.c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((v97) it.next()).a(this);
        }
    }

    @Override // defpackage.l78
    public k78[] e0() {
        return this.b.e0();
    }

    @Override // defpackage.l78
    public final int getFormat() {
        return this.b.getFormat();
    }

    @Override // defpackage.l78
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override // defpackage.l78
    public m68 getImageInfo() {
        return this.b.getImageInfo();
    }

    @Override // defpackage.l78
    public int getWidth() {
        return this.b.getWidth();
    }
}
