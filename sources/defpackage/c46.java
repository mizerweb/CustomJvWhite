package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import one.me.sdk.emoji.sprite.IllegalWidthSpriteException;

/* JADX INFO: loaded from: classes.dex */
public final class c46 implements lnk {
    public final Object a;
    public final Object b;
    public final Object c;

    public c46(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = new ifh(new x82(ny8Var, ny8Var3, 1));
        ifh ifhVar = new ifh(new x5(this, 25, ny8Var2));
        this.b = ifhVar;
        this.c = (bib) ifhVar.getValue();
    }

    public void a(long j) {
        bib bibVar = (bib) ((ifh) this.b).getValue();
        if (bibVar.e()) {
            ReentrantLock reentrantLock = bibVar.f;
            reentrantLock.lock();
            try {
                bibVar.e.a(j);
                reentrantLock.unlock();
                bibVar.b();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[LOOP:0: B:11:0x0027->B:24:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0064 A[EDGE_INSN: B:34:0x0064->B:25:0x0064 BREAK  A[LOOP:0: B:11:0x0027->B:24:0x0061], SYNTHETIC] */
    public void b(m8b m8bVar) {
        bib bibVar = (bib) ((ifh) this.b).getValue();
        if (m8bVar.i()) {
            bibVar.getClass();
            return;
        }
        if (bibVar.e()) {
            ReentrantLock reentrantLock = bibVar.f;
            reentrantLock.lock();
            try {
                long[] jArr = m8bVar.b;
                long[] jArr2 = m8bVar.a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr2[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    bibVar.e.a(jArr[(i << 3) + i3]);
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                reentrantLock.unlock();
                bibVar.b();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public void c(Collection collection) {
        bib bibVar = (bib) ((ifh) this.b).getValue();
        bibVar.getClass();
        if (collection.isEmpty() || !bibVar.e()) {
            return;
        }
        ReentrantLock reentrantLock = bibVar.f;
        reentrantLock.lock();
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                bibVar.e.a(((Number) it.next()).longValue());
            }
            reentrantLock.unlock();
            bibVar.b();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void d() {
        try {
            ForkJoinTask.invokeAll((ArrayList) this.c);
            ((ArrayList) this.c).clear();
        } catch (Throwable th) {
            try {
                Throwable th2 = th;
                for (y77 y77Var : (ArrayList) this.c) {
                    Throwable th3 = y77Var.d;
                    if (cqk.d(th3 != null ? th3.getClass() : null, th.getClass())) {
                        th2 = th3;
                    }
                    y77Var.cancel(true);
                    y77Var.completeExceptionally(th);
                }
                throw th2;
            } catch (Throwable th4) {
                ((ArrayList) this.c).clear();
                throw th4;
            }
        }
    }

    public boolean e() {
        synchronized (this) {
            if (((AtomicBoolean) this.c).get()) {
                return false;
            }
            ((AtomicInteger) this.b).incrementAndGet();
            return true;
        }
    }

    public x77 f(String str, Iterable iterable, af7 af7Var) {
        x77 x77Var = new x77(str, new w77(iterable, af7Var, this, str, 0));
        ArrayList arrayList = (ArrayList) this.c;
        y77 y77Var = x77Var.b;
        arrayList.add(0, y77Var);
        ForkJoinPool.commonPool().execute(y77Var);
        return x77Var;
    }

    public e70 h(int i) {
        List list = (List) this.a;
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return (e70) list.get(i);
    }

    public int i() {
        List list = (List) this.a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int j(y60 y60Var) {
        Iterator it = ((List) this.a).iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((e70) it.next()).a == y60Var) {
                i++;
            }
        }
        return i;
    }

    public e70 k(String str) {
        for (e70 e70Var : (List) this.a) {
            if (ch3.a(str, e70Var.t)) {
                return e70Var;
            }
        }
        return null;
    }

    public e70 l(y60 y60Var) {
        for (e70 e70Var : (List) this.a) {
            if (e70Var.a == y60Var) {
                return e70Var;
            }
        }
        return null;
    }

    public rac m() {
        return (rac) this.a;
    }

    public void n(Object obj) {
        e74 e74Var = (e74) this.a;
        LinkedHashMap linkedHashMap = e74Var.b;
        ArrayList arrayList = e74Var.d;
        String str = (String) this.b;
        Object obj2 = linkedHashMap.get(str);
        p90 p90Var = (p90) this.c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + p90Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            e74Var.b(iIntValue, p90Var, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }

    public Bitmap o(y46 y46Var) {
        Bitmap bitmap = (Bitmap) ((i56) this.a).b.c(y46Var);
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        int i = y46Var.a;
        Bitmap bitmap2 = ((i56) this.a).a[i];
        if (bitmap2 != null) {
            n56 n56Var = (n56) this.b;
            wme wmeVar = n56Var.c;
            int iK = gm0.K(((Number) wmeVar.getValue()).floatValue() * 13.0f);
            boolean z = bitmap2.getWidth() == iK;
            if (!z) {
                if (iK == 0) {
                    wmeVar.a();
                    n56Var.d.a();
                }
                gm0.V(n56Var.b, "Sprite is not width enough, may be a problem of extracting emoji", new IllegalWidthSpriteException(i, bitmap2.getWidth(), iK, n56Var.a.getResources().getDisplayMetrics().densityDpi));
            }
            if (z) {
                n56 n56Var2 = (n56) this.b;
                float fFloatValue = ((Number) n56Var2.d.getValue()).floatValue();
                int iK2 = gm0.K(y46Var.b * fFloatValue);
                int iK3 = gm0.K(y46Var.c * fFloatValue);
                int iK4 = gm0.K(((Number) n56Var2.c.getValue()).floatValue());
                Rect rect = n56.e;
                rect.left = 0;
                rect.top = 0;
                rect.right = iK4;
                rect.bottom = iK4;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, oc9.v(iK2, 0, bitmap2.getWidth() - iK4), oc9.v(iK3, 0, bitmap2.getHeight() - iK4), iK4, iK4);
                ((i56) this.a).b.d(new y46(y46Var.a, y46Var.b, y46Var.c), bitmapCreateBitmap);
                return bitmapCreateBitmap;
            }
        }
        String name = c46.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.s("Cannot resolve SpriteBitmap. It's null - ", bitmap2 == null), null);
            }
        }
        l56 l56Var = (l56) this.c;
        l56Var.g.computeIfAbsent(Integer.valueOf(i), new mm(9, new aa(l56Var, i, 1)));
        return null;
    }

    public f70 p() {
        f70 f70Var = new f70();
        f70Var.a = new ArrayList((List) this.a);
        f70Var.b = (kg8) this.b;
        return f70Var;
    }

    public void q() {
        synchronized (this) {
            ((AtomicInteger) this.b).decrementAndGet();
            if (((AtomicInteger) this.b).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public void r() {
        Integer num;
        e74 e74Var = (e74) this.a;
        String str = (String) this.b;
        Bundle bundle = e74Var.g;
        LinkedHashMap linkedHashMap = e74Var.f;
        if (!e74Var.d.contains(str) && (num = (Integer) e74Var.b.remove(str)) != null) {
            e74Var.a.remove(num);
        }
        e74Var.e.remove(str);
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbV = qt4.v("Dropping pending result for request ", str, ": ");
            sbV.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbV.toString());
            linkedHashMap.remove(str);
        }
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((t9) tre.f0(bundle, str, t9.class)));
            bundle.remove(str);
        }
        qt4.A(e74Var.c.get(str));
    }

    @Override // defpackage.lnk
    public Object zza() {
        Object objZza = ((lnk) this.a).zza();
        return new z8l((i3m) objZza, ((c1k) ((v56) this.c).b).a);
    }

    public c46() {
        this.a = new ConcurrentSkipListSet();
        this.b = new z77(this);
        this.c = new ArrayList();
    }

    public c46(f70 f70Var) {
        this.a = f70Var.a;
        this.b = f70Var.b;
        this.c = f70Var.c;
    }

    public /* synthetic */ c46(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public c46(fl9 fl9Var) {
        this.a = fl9Var;
        this.b = new AtomicInteger(0);
        this.c = new AtomicBoolean(false);
    }
}
