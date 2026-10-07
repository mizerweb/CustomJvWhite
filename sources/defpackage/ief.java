package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class ief {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set d = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set e = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set f = Collections.newSetFromMap(new ConcurrentHashMap());
    public final nni g;
    public final ih h;
    public CharSequence i;
    public gef j;
    public final AtomicBoolean k;
    public final CopyOnWriteArraySet l;

    public ief(nni nniVar, ih ihVar) {
        Collections.newSetFromMap(new ConcurrentHashMap());
        this.k = new AtomicBoolean(false);
        this.l = new CopyOnWriteArraySet();
        this.g = nniVar;
        this.h = ihVar;
        if (nniVar.d.getBoolean("app.send.media.as.collage", true)) {
            this.j = gef.c;
        } else {
            this.j = gef.a;
        }
    }

    public static boolean m(hb9 hb9Var, kef kefVar) {
        hb9 hb9Var2 = kefVar.a;
        if (hb9Var2 == null || hb9Var == null) {
            return false;
        }
        if ((hb9Var instanceof p50) && (hb9Var2 instanceof p50)) {
            return ch3.a(((p50) hb9Var).j.t, ((p50) hb9Var2).j.t);
        }
        if (hb9Var2.b == hb9Var.b) {
            return true;
        }
        return s1m.a(hb9Var.d(), hb9Var2.d());
    }

    public final void a() {
        this.a.clear();
        p();
        this.b.clear();
        if (this.g.d.getBoolean("app.send.media.as.collage", true)) {
            this.j = gef.c;
        } else {
            this.j = gef.a;
        }
    }

    public final int b(hb9 hb9Var, int i) throws IllegalAccessException, InvocationTargetException {
        kef kefVarI = i(hb9Var);
        if (kefVarI != null && l(hb9Var)) {
            return h(hb9Var);
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        Set set = this.e;
        if (kefVarI != null) {
            kefVarI.c = (rvc) concurrentHashMap.get(Long.valueOf(hb9Var.b));
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    try {
                        ((bj7) it.next()).a(kefVarI);
                    } catch (Throwable th) {
                        qr7.o(th);
                        return 0;
                    }
                }
            }
            p();
            return h(hb9Var);
        }
        kef kefVar = new kef(hb9Var);
        kefVar.c = (rvc) concurrentHashMap.get(Long.valueOf(hb9Var.b));
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if (i < 0 || i >= copyOnWriteArraySet.size()) {
            copyOnWriteArraySet.add(kefVar);
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    try {
                        ((bj7) it2.next()).a(kefVar);
                    } catch (Throwable th2) {
                        qr7.o(th2);
                        return 0;
                    }
                }
            }
            p();
        } else {
            ArrayList<kef> arrayList = new ArrayList(copyOnWriteArraySet);
            arrayList.add(i, kefVar);
            copyOnWriteArraySet.clear();
            for (kef kefVar2 : arrayList) {
                copyOnWriteArraySet.add(kefVar2);
                if (set != null) {
                    Iterator it3 = set.iterator();
                    while (it3.hasNext()) {
                        try {
                            ((bj7) it3.next()).a(kefVar2);
                        } catch (Throwable th3) {
                            qr7.o(th3);
                            return 0;
                        }
                    }
                }
                p();
            }
        }
        return h(hb9Var);
    }

    public final int c() {
        List list;
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if (copyOnWriteArraySet == null || !copyOnWriteArraySet.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArraySet) {
                try {
                    ((kef) obj).getClass();
                    arrayList.add(obj);
                } catch (Throwable th) {
                    qr7.o(th);
                    return 0;
                }
            }
            list = arrayList;
        } else {
            list = Collections.EMPTY_LIST;
        }
        return list.size();
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (kef kefVar : this.a) {
            kefVar.getClass();
            arrayList.add(v(kefVar));
        }
        return arrayList;
    }

    public final rvc e(hb9 hb9Var) {
        kef kefVarI = i(hb9Var);
        rvc rvcVar = kefVarI != null ? kefVarI.c : null;
        if (rvcVar == null) {
            return (rvc) this.b.get(Long.valueOf(hb9Var.b));
        }
        return rvcVar;
    }

    public final String f(kef kefVar) {
        rvc rvcVar = kefVar.c;
        Uri uri = rvcVar != null ? rvcVar.e : null;
        Uri uri2 = rvcVar != null ? rvcVar.b : null;
        Uri uri3 = rvcVar != null ? rvcVar.a : null;
        if (uri == null) {
            if (uri2 != null) {
                return uri2.getPath();
            }
            if (uri3 != null) {
                return uri3.getPath();
            }
            return null;
        }
        Uri uriA = rvc.a(kefVar.a, rvcVar);
        try {
            ih ihVar = this.h;
            Bitmap bitmapY = ihVar.y(uriA, true);
            Bitmap bitmapY2 = ihVar.y(uri, false);
            Canvas canvas = new Canvas(bitmapY);
            float width = bitmapY.getWidth() / bitmapY2.getWidth();
            canvas.scale(width, width);
            canvas.drawBitmap(bitmapY2, 0.0f, 0.0f, (Paint) null);
            rs6 rs6Var = (rs6) ihVar.b;
            rs6Var.getClass();
            File fileP = ((ju6) rs6Var).p(null, "jpg");
            String absolutePath = fileP.getAbsolutePath();
            int i = sb8.j;
            sb8.l0(absolutePath, bitmapY, 100, Bitmap.CompressFormat.JPEG);
            return fileP.getAbsolutePath();
        } catch (Exception e) {
            gm0.V("ief", "getPhotoEditorPath: exception", e);
            return uriA.toString();
        }
    }

    public final int g(long j) {
        if (!k(j)) {
            return 0;
        }
        int i = 1;
        for (kef kefVar : this.a) {
            kefVar.getClass();
            if (kefVar.a.b == j) {
                break;
            }
            i++;
        }
        return i;
    }

    public final int h(hb9 hb9Var) {
        if (!l(hb9Var)) {
            return 0;
        }
        int i = 1;
        for (kef kefVar : this.a) {
            kefVar.getClass();
            if (m(hb9Var, kefVar)) {
                break;
            }
            i++;
        }
        return i;
    }

    public final kef i(hb9 hb9Var) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        Object obj = null;
        if (copyOnWriteArraySet != null) {
            for (Object obj2 : copyOnWriteArraySet) {
                try {
                    if (m(hb9Var, (kef) obj2)) {
                        obj = obj2;
                        break;
                    }
                } catch (Throwable th) {
                    qr7.o(th);
                    return null;
                }
            }
        }
        return (kef) obj;
    }

    public final boolean j(sfa sfaVar) {
        int size = sfaVar.C() ? p90.l((List) sfaVar.n.a, new kn3(3)).size() : 0;
        CopyOnWriteArraySet<kef> copyOnWriteArraySet = this.a;
        if (size != copyOnWriteArraySet.size()) {
            return true;
        }
        for (kef kefVar : copyOnWriteArraySet) {
            kefVar.getClass();
            hb9 hb9Var = kefVar.a;
            if (rvc.b(hb9Var, kefVar.c) || !(hb9Var instanceof p50)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(long j) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.a;
        if (copyOnWriteArraySet == null || !copyOnWriteArraySet.isEmpty()) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                try {
                    if (((kef) it.next()).a.b == j) {
                        return true;
                    }
                } catch (Throwable th) {
                    qr7.o(th);
                }
            }
        }
        return false;
    }

    public final boolean l(hb9 hb9Var) {
        CopyOnWriteArraySet<kef> copyOnWriteArraySet = this.a;
        if (copyOnWriteArraySet == null || !copyOnWriteArraySet.isEmpty()) {
            for (kef kefVar : copyOnWriteArraySet) {
                try {
                    kefVar.getClass();
                    if (m(hb9Var, kefVar)) {
                        return true;
                    }
                } catch (Throwable th) {
                    qr7.o(th);
                }
            }
        }
        return false;
    }

    public final w6g n(kef kefVar) {
        int i;
        hb9 hb9Var = kefVar.a;
        gef gefVar = this.j;
        gef gefVar2 = gef.b;
        if (gefVar != gefVar2 && (i = hb9Var.a) == 3 && kefVar.b != null) {
            return new mxi(i, hb9Var.a(), kefVar.b, hb9Var.d);
        }
        int i2 = hb9Var.a;
        String strA = hb9Var.a();
        if (this.j == gefVar2) {
            i2 = 7;
        }
        return new w6g(i2, strA);
    }

    public final void o(kef kefVar) {
        for (si7 si7Var : this.f) {
            int i = si7Var.a;
            a8j a8jVar = si7Var.b;
            switch (i) {
                case 0:
                    ej7 ej7Var = (ej7) a8jVar;
                    xt4 xt4VarF = ((n0c) ej7Var.D()).f();
                    yt4 yt4Var = ej7Var.g;
                    xt4VarF.getClass();
                    a8j.t(ej7Var, lvb.x0(xt4VarF, yt4Var), new el6(ej7Var, kefVar, null, 7), 2);
                    break;
                case 1:
                    a8j.x(((lx9) a8jVar).w, sbi.a);
                    break;
                default:
                    ((hff) a8jVar).H();
                    break;
            }
        }
    }

    public final void p() throws IllegalAccessException, InvocationTargetException {
        Iterator it = this.c.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            AtomicBoolean atomicBoolean = this.k;
            if (!zHasNext) {
                atomicBoolean.set(false);
                return;
            }
            ti7 ti7Var = (ti7) it.next();
            Set setUnmodifiableSet = Collections.unmodifiableSet(this.a);
            boolean z = atomicBoolean.get();
            int i = ti7Var.a;
            a8j a8jVar = ti7Var.b;
            switch (i) {
                case 0:
                    ej7 ej7Var = (ej7) a8jVar;
                    mjg mjgVar = ej7Var.m;
                    Boolean boolValueOf = Boolean.valueOf(setUnmodifiableSet.size() >= 100);
                    mjgVar.getClass();
                    mjgVar.j(null, boolValueOf);
                    gm0.n("ej7", "onSelectedMediasChangeListener(), selectedCount " + setUnmodifiableSet.size());
                    if (setUnmodifiableSet.isEmpty()) {
                        ej7Var.C(z, false);
                    } else {
                        sgg sggVar = ej7Var.B;
                        if (sggVar != null) {
                            sggVar.b(null);
                        }
                        ej7Var.B = a8j.t(ej7Var, ej7Var.g, new qc5(ej7Var, setUnmodifiableSet, (lq4) null, 23), 2);
                    }
                    ej7Var.e.B(srh.a(ej7Var.w));
                    break;
                case 1:
                    a8j.x(((lx9) a8jVar).w, sbi.a);
                    break;
                default:
                    ((hff) a8jVar).H();
                    break;
            }
        }
    }

    public final void q(hb9 hb9Var, Uri uri) throws IllegalAccessException, InvocationTargetException {
        b(hb9Var, this.a.size());
        kef kefVarI = i(hb9Var);
        if (kefVarI == null) {
            return;
        }
        hb9 hb9Var2 = kefVarI.a;
        if (hb9Var2 instanceof p50) {
            p50 p50Var = (p50) hb9Var2;
            String name = p50.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, qv1.k("Set content uri ", uri.getPath()), null);
                }
            }
            p50Var.l = uri;
            String str = p50Var.j.u;
            if (str == null || str.length() == 0) {
                c60 c60VarJ = p50Var.j.j();
                c60VarJ.m = uri.getPath();
                p50Var.j = c60VarJ.a();
            }
        }
        o(kefVarI);
    }

    public final void r(hb9 hb9Var, File file) throws IllegalAccessException, InvocationTargetException {
        b(hb9Var, this.a.size());
        kef kefVarI = i(hb9Var);
        if (kefVarI == null) {
            return;
        }
        hb9 hb9Var2 = kefVarI.a;
        if (hb9Var2 instanceof p50) {
            p50 p50Var = (p50) hb9Var2;
            gm0.n("p50", "Set downloaded file " + file.getPath());
            p50Var.k = file;
            String str = p50Var.j.u;
            if (str == null || str.length() == 0) {
                c60 c60VarJ = p50Var.j.j();
                c60VarJ.m = file.getPath();
                p50Var.j = c60VarJ.a();
            }
        }
        o(kefVarI);
    }

    public final void s(gef gefVar) {
        if (c() > 1) {
            gef gefVar2 = gef.c;
            nni nniVar = this.g;
            if (gefVar == gefVar2) {
                nniVar.c("app.send.media.as.collage", true);
            } else if (gefVar == gef.a) {
                nniVar.c("app.send.media.as.collage", false);
            }
        }
        this.j = gefVar;
        Iterator it = this.d.iterator();
        if (it.hasNext()) {
            throw qt4.h(it);
        }
    }

    public final void t(hb9 hb9Var, rvc rvcVar) throws IllegalAccessException, InvocationTargetException {
        b(hb9Var, this.a.size());
        kef kefVarI = i(hb9Var);
        if (kefVarI != null) {
            kefVarI.c = rvcVar;
        }
        this.b.put(Long.valueOf(hb9Var.b), rvcVar);
        o(kefVarI);
    }

    public final void u(hb9 hb9Var, fvi fviVar) throws IllegalAccessException, InvocationTargetException {
        b(hb9Var, this.a.size());
        kef kefVarI = i(hb9Var);
        if (kefVarI != null) {
            kefVarI.b = fviVar;
        }
        o(kefVarI);
    }

    public final w6g v(kef kefVar) {
        hb9 hb9Var = kefVar.a;
        if ((hb9Var instanceof p50) && !rvc.b(hb9Var, kefVar.c)) {
            return new q50(hb9Var.a, hb9Var.a(), ((p50) hb9Var).j);
        }
        String strF = f(kefVar);
        if (strF == null) {
            return n(kefVar);
        }
        int i = hb9Var.a;
        if (this.j == gef.b) {
            i = 7;
        }
        return new w6g(i, strF);
    }

    public final int w(hb9 hb9Var) {
        int iB;
        kef kefVar;
        CopyOnWriteArraySet copyOnWriteArraySet = this.l;
        if (copyOnWriteArraySet != null) {
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                try {
                    ((ui7) it.next()).a(hef.a);
                } catch (Throwable th) {
                    qr7.o(th);
                    return 0;
                }
            }
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.a;
        int size = copyOnWriteArraySet2.size();
        boolean zL = l(hb9Var);
        Set<bj7> set = this.e;
        if (zL) {
            Iterator it2 = copyOnWriteArraySet2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    kefVar = null;
                    break;
                }
                kefVar = (kef) it2.next();
                if (m(hb9Var, kefVar)) {
                    copyOnWriteArraySet2.remove(kefVar);
                    break;
                }
            }
            if (kefVar != null && set != null) {
                for (bj7 bj7Var : set) {
                    try {
                        bj7Var.getClass();
                        gm0.n("ej7", "onMediaDeselect()");
                        ej7 ej7Var = bj7Var.a;
                        if (ej7Var.x) {
                            gm0.Y("ej7", "Early return in onMediaDeselect cuz of isItemSelectInProcess");
                        } else {
                            ej7Var.F(h1h.c(kefVar.a), false);
                        }
                    } catch (Throwable th2) {
                        qr7.o(th2);
                        return 0;
                    }
                }
            }
            p();
            if (kefVar != null && !hb9Var.c.equals(rvc.a(hb9Var, kefVar.c).toString())) {
                o(kefVar);
            }
            iB = 0;
        } else {
            kef kefVarI = i(hb9Var);
            if (kefVarI != null) {
                copyOnWriteArraySet2.remove(kefVarI);
                copyOnWriteArraySet2.add(kefVarI);
                if (set != null) {
                    Iterator it3 = set.iterator();
                    while (it3.hasNext()) {
                        try {
                            ((bj7) it3.next()).a(kefVarI);
                        } catch (Throwable th3) {
                            qr7.o(th3);
                            return 0;
                        }
                    }
                }
                p();
                iB = h(hb9Var);
            } else {
                iB = b(hb9Var, size);
            }
        }
        if (copyOnWriteArraySet != null) {
            Iterator it4 = copyOnWriteArraySet.iterator();
            while (it4.hasNext()) {
                try {
                    ((ui7) it4.next()).a(hef.b);
                } catch (Throwable th4) {
                    qr7.o(th4);
                    return 0;
                }
            }
        }
        return iB;
    }
}
