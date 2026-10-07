package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes.dex */
public final class ma implements jd6 {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public ma(ec ecVar, w4 w4Var, y8e y8eVar, lc6 lc6Var) {
        List listL;
        this.b = ecVar;
        this.d = w4Var;
        r66 r66Var = r66.a;
        this.e = r66Var;
        this.f = r66Var;
        this.c = new ArrayList();
        URI uriI = ecVar.h.i();
        if (uriI.getHost() == null) {
            listL = uqi.l(Proxy.NO_PROXY);
        } else {
            List<Proxy> listSelect = ecVar.g.select(uriI);
            List<Proxy> list = listSelect;
            listL = (list == null || list.isEmpty()) ? uqi.l(Proxy.NO_PROXY) : uqi.x(listSelect);
        }
        this.e = listL;
        this.a = 0;
    }

    public void A(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            la laVar = (la) arrayList.get(i);
            laVar.c = null;
            ((rbd) this.b).d(laVar);
        }
        arrayList.clear();
    }

    public void B(Runnable runnable) {
        sfh sfhVar = (sfh) this.b;
        if (sfhVar.a.getLooper().getThread().isAlive()) {
            sfhVar.f(runnable);
        }
    }

    public void C(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((lh6) this.d) == null) {
                this.d = new lh6();
            }
            lh6 lh6Var = (lh6) this.d;
            lh6Var.d = colorStateList;
            lh6Var.c = true;
        } else {
            this.d = null;
        }
        i();
    }

    public void D(ColorStateList colorStateList) {
        if (((lh6) this.e) == null) {
            this.e = new lh6();
        }
        lh6 lh6Var = (lh6) this.e;
        lh6Var.d = colorStateList;
        lh6Var.c = true;
        i();
    }

    public void E(PorterDuff.Mode mode) {
        if (((lh6) this.e) == null) {
            this.e = new lh6();
        }
        lh6 lh6Var = (lh6) this.e;
        lh6Var.e = mode;
        lh6Var.b = true;
        i();
    }

    public int F(int i, int i2) {
        int i3;
        int i4;
        rbd rbdVar = (rbd) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            la laVar = (la) arrayList.get(size);
            int i5 = laVar.a;
            int i6 = laVar.b;
            if (i5 == 8) {
                int i7 = laVar.d;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            laVar.b = i6 + 1;
                            laVar.d = i7 + 1;
                        } else if (i2 == 2) {
                            laVar.b = i6 - 1;
                            laVar.d = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        laVar.d = i7 + 1;
                    } else if (i2 == 2) {
                        laVar.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        laVar.b = i6 + 1;
                    } else if (i2 == 2) {
                        laVar.b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= laVar.d;
                } else if (i5 == 2) {
                    i += laVar.d;
                }
            } else if (i2 == 1) {
                laVar.b = i6 + 1;
            } else if (i2 == 2) {
                laVar.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            la laVar2 = (la) arrayList.get(size2);
            int i8 = laVar2.a;
            int i9 = laVar2.d;
            if (i8 == 8) {
                if (i9 == laVar2.b || i9 < 0) {
                    arrayList.remove(size2);
                    laVar2.c = null;
                    rbdVar.d(laVar2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                laVar2.c = null;
                rbdVar.d(laVar2);
            }
        }
        return i;
    }

    public void G(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        bg6 bg6Var = ((pf6) this.d).a;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int iIntValue = num.intValue();
        bg6Var.I0();
        bg6Var.x0(1, 10, num);
        bg6Var.x0(2, 10, num);
        bg6Var.n.f(21, new pe4(iIntValue, 3));
    }

    public void H(hu7 hu7Var, String str) {
        x41 x41Var = (x41) this.e;
        if (this.a != 0) {
            qr7.u(this.a, "state: ");
            return;
        }
        x41Var.L(str).L("\r\n");
        int size = hu7Var.size();
        for (int i = 0; i < size; i++) {
            x41Var.L(hu7Var.b(i)).L(": ").L(hu7Var.f(i)).L("\r\n");
        }
        x41Var.L("\r\n");
        this.a = 1;
    }

    @Override // defpackage.jd6
    public void a(dle dleVar) {
        Proxy.Type type = ((c9e) this.c).b.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(dleVar.b);
        sb.append(' ');
        k28 k28Var = dleVar.a;
        if (k28Var.i || type != Proxy.Type.HTTP) {
            String strB = k28Var.b();
            String strD = k28Var.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(k28Var);
        }
        sb.append(" HTTP/1.1");
        H(dleVar.c, sb.toString());
    }

    @Override // defpackage.jd6
    public void b() {
        ((x41) this.e).flush();
    }

    @Override // defpackage.jd6
    public kag c(dle dleVar, long j) {
        if (HTTP.CHUNK_CODING.equalsIgnoreCase(dleVar.c.a(HTTP.TRANSFER_ENCODING))) {
            if (this.a == 1) {
                this.a = 2;
                return new i08(this);
            }
            qr7.u(this.a, "state: ");
            return null;
        }
        if (j == -1) {
            ore.k("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.a == 1) {
            this.a = 2;
            return new l08(this);
        }
        qr7.u(this.a, "state: ");
        return null;
    }

    @Override // defpackage.jd6
    public void cancel() {
        Socket socket = ((c9e) this.c).c;
        if (socket != null) {
            uqi.e(socket);
        }
    }

    @Override // defpackage.jd6
    public c9e d() {
        return (c9e) this.c;
    }

    @Override // defpackage.jd6
    public mdg e(pne pneVar) {
        if (!t18.a(pneVar)) {
            return u(0L);
        }
        String strA = pneVar.f.a(HTTP.TRANSFER_ENCODING);
        if (strA == null) {
            strA = null;
        }
        if (HTTP.CHUNK_CODING.equalsIgnoreCase(strA)) {
            k28 k28Var = pneVar.a.a;
            if (this.a == 4) {
                this.a = 5;
                return new j08(this, k28Var);
            }
            qr7.u(this.a, "state: ");
            return null;
        }
        long jK = uqi.k(pneVar);
        if (jK != -1) {
            return u(jK);
        }
        if (this.a != 4) {
            qr7.u(this.a, "state: ");
            return null;
        }
        this.a = 5;
        ((c9e) this.c).k();
        return new m08(this);
    }

    @Override // defpackage.jd6
    public long f(pne pneVar) {
        if (!t18.a(pneVar)) {
            return 0L;
        }
        String strA = pneVar.f.a(HTTP.TRANSFER_ENCODING);
        if (strA == null) {
            strA = null;
        }
        if (HTTP.CHUNK_CODING.equalsIgnoreCase(strA)) {
            return -1L;
        }
        return uqi.k(pneVar);
    }

    @Override // defpackage.jd6
    public one g(boolean z) throws IOException {
        xp3 xp3Var = (xp3) this.f;
        int i = this.a;
        if (i != 1 && i != 2 && i != 3) {
            qr7.u(this.a, "state: ");
            return null;
        }
        try {
            String strJ = ((y41) xp3Var.c).j(xp3Var.b);
            xp3Var.b -= (long) strJ.length();
            hle hleVarO = n1g.O(strJ);
            int i2 = hleVarO.b;
            one oneVar = new one();
            oneVar.b = (twd) hleVarO.c;
            oneVar.c = i2;
            oneVar.d = (String) hleVarO.d;
            oneVar.f = xp3Var.f().c();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.a = 3;
                return oneVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.a = 4;
                return oneVar;
            }
            this.a = 3;
            return oneVar;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(((c9e) this.c).b.a.h.h()), e);
        }
    }

    @Override // defpackage.jd6
    public void h() {
        ((x41) this.e).flush();
    }

    public void i() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((lh6) this.d) != null) {
                if (((lh6) this.f) == null) {
                    this.f = new lh6();
                }
                lh6 lh6Var = (lh6) this.f;
                lh6Var.b();
                WeakHashMap weakHashMap = i7j.a;
                ColorStateList colorStateListC = y6j.c(view);
                if (colorStateListC != null) {
                    lh6Var.c = true;
                    lh6Var.d = colorStateListC;
                }
                PorterDuff.Mode modeD = y6j.d(view);
                if (modeD != null) {
                    lh6Var.b = true;
                    lh6Var.e = modeD;
                }
                if (lh6Var.c || lh6Var.b) {
                    xr.d(background, lh6Var, view.getDrawableState());
                    return;
                }
            }
            lh6 lh6Var2 = (lh6) this.e;
            if (lh6Var2 != null) {
                xr.d(background, lh6Var2, view.getDrawableState());
                return;
            }
            lh6 lh6Var3 = (lh6) this.d;
            if (lh6Var3 != null) {
                xr.d(background, lh6Var3, view.getDrawableState());
            }
        }
    }

    public boolean j(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            la laVar = (la) arrayList.get(i2);
            int i3 = laVar.a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = laVar.b;
                    int i5 = laVar.d + i4;
                    while (i4 < i5) {
                        if (o(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (o(laVar.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void k() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((v56) this.e).x((la) arrayList.get(i));
        }
        A(arrayList);
        this.a = 0;
    }

    public void l() {
        v56 v56Var = (v56) this.e;
        k();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            la laVar = (la) arrayList.get(i);
            int i2 = laVar.a;
            if (i2 == 1) {
                v56Var.x(laVar);
                v56Var.G(laVar.b, laVar.d);
            } else if (i2 == 2) {
                v56Var.x(laVar);
                int i3 = laVar.b;
                int i4 = laVar.d;
                RecyclerView recyclerView = (RecyclerView) v56Var.b;
                recyclerView.c0(i3, i4, true);
                recyclerView.J1 = true;
                recyclerView.G1.d += i4;
            } else if (i2 == 4) {
                v56Var.x(laVar);
                v56Var.F(laVar.b, laVar.d, laVar.c);
            } else if (i2 == 8) {
                v56Var.x(laVar);
                v56Var.H(laVar.b, laVar.d);
            }
        }
        A(arrayList);
        this.a = 0;
    }

    public void m(la laVar) {
        int i;
        rbd rbdVar = (rbd) this.b;
        int i2 = laVar.a;
        if (i2 == 1 || i2 == 8) {
            ore.p("should not dispatch add or move for pre layout");
            return;
        }
        int iF = F(laVar.b, i2);
        int i3 = laVar.b;
        int i4 = laVar.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                qr7.y(laVar, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < laVar.d; i6++) {
            int iF2 = F((i * i6) + laVar.b, laVar.a);
            int i7 = laVar.a;
            if (i7 == 2 ? iF2 != iF : !(i7 == 4 && iF2 == iF + 1)) {
                la laVarV = v(laVar.c, i7, iF, i5);
                n(laVarV, i3);
                laVarV.c = null;
                rbdVar.d(laVarV);
                if (laVar.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iF = iF2;
            } else {
                i5++;
            }
        }
        Object obj = laVar.c;
        laVar.c = null;
        rbdVar.d(laVar);
        if (i5 > 0) {
            la laVarV2 = v(obj, laVar.a, iF, i5);
            n(laVarV2, i3);
            laVarV2.c = null;
            rbdVar.d(laVarV2);
        }
    }

    public void n(la laVar, int i) {
        v56 v56Var = (v56) this.e;
        v56Var.x(laVar);
        int i2 = laVar.a;
        if (i2 != 2) {
            if (i2 == 4) {
                v56Var.F(i, laVar.d, laVar.c);
                return;
            } else {
                ore.p("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = laVar.d;
        RecyclerView recyclerView = (RecyclerView) v56Var.b;
        recyclerView.c0(i, i3, true);
        recyclerView.J1 = true;
        recyclerView.G1.d += i3;
    }

    public int o(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            la laVar = (la) arrayList.get(i2);
            int i3 = laVar.a;
            int i4 = laVar.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = laVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (laVar.d <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = laVar.d;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += laVar.d;
            }
            i2++;
        }
        return i;
    }

    public ColorStateList p() {
        lh6 lh6Var = (lh6) this.e;
        if (lh6Var != null) {
            return (ColorStateList) lh6Var.d;
        }
        return null;
    }

    public PorterDuff.Mode q() {
        lh6 lh6Var = (lh6) this.e;
        if (lh6Var != null) {
            return (PorterDuff.Mode) lh6Var.e;
        }
        return null;
    }

    public boolean r() {
        return this.a < ((List) this.e).size() || !((ArrayList) this.c).isEmpty();
    }

    public boolean s() {
        return ((ArrayList) this.c).size() > 0;
    }

    public void t(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListG;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = l3e.z;
        vbf vbfVarK = vbf.k(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) vbfVarK.b;
        View view2 = (View) this.b;
        i7j.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) vbfVarK.b, i, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                xr xrVar = (xr) this.c;
                Context context2 = view.getContext();
                int i2 = this.a;
                synchronized (xrVar) {
                    colorStateListG = xrVar.a.g(context2, i2);
                }
                if (colorStateListG != null) {
                    C(colorStateListG);
                }
            }
            if (typedArray.hasValue(1)) {
                y6j.i(view, vbfVarK.c(1));
            }
            if (typedArray.hasValue(2)) {
                y6j.j(view, vt5.c(typedArray.getInt(2, -1), null));
            }
            vbfVarK.l();
        } catch (Throwable th) {
            vbfVarK.l();
            throw th;
        }
    }

    public k08 u(long j) {
        if (this.a == 4) {
            this.a = 5;
            return new k08(this, j);
        }
        qr7.u(this.a, "state: ");
        return null;
    }

    public la v(Object obj, int i, int i2, int i3) {
        la laVar = (la) ((rbd) this.b).a();
        if (laVar != null) {
            laVar.a = i;
            laVar.b = i2;
            laVar.d = i3;
            laVar.c = obj;
            return laVar;
        }
        la laVar2 = new la();
        laVar2.a = i;
        laVar2.b = i2;
        laVar2.d = i3;
        laVar2.c = obj;
        return laVar2;
    }

    public void w() {
        this.a = -1;
        C(null);
        i();
    }

    public void x(int i) {
        ColorStateList colorStateListG;
        this.a = i;
        xr xrVar = (xr) this.c;
        if (xrVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (xrVar) {
                colorStateListG = xrVar.a.g(context, i);
            }
        } else {
            colorStateListG = null;
        }
        C(colorStateListG);
        i();
    }

    public void y(la laVar) {
        v56 v56Var = (v56) this.e;
        ((ArrayList) this.d).add(laVar);
        int i = laVar.a;
        if (i == 1) {
            v56Var.G(laVar.b, laVar.d);
            return;
        }
        if (i == 2) {
            int i2 = laVar.b;
            int i3 = laVar.d;
            RecyclerView recyclerView = (RecyclerView) v56Var.b;
            recyclerView.c0(i2, i3, false);
            recyclerView.J1 = true;
            return;
        }
        if (i == 4) {
            v56Var.F(laVar.b, laVar.d, laVar.c);
        } else if (i == 8) {
            v56Var.H(laVar.b, laVar.d);
        } else {
            qr7.y(laVar, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018c  */
    /* JADX WARN: Code duplicated, block: B:103:0x019a  */
    /* JADX WARN: Code duplicated, block: B:104:0x019e  */
    /* JADX WARN: Code duplicated, block: B:186:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:75:0x0134  */
    /* JADX WARN: Code duplicated, block: B:76:0x0136  */
    /* JADX WARN: Code duplicated, block: B:78:0x013c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0147  */
    /* JADX WARN: Code duplicated, block: B:84:0x0152  */
    /* JADX WARN: Code duplicated, block: B:87:0x015d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0163  */
    /* JADX WARN: Code duplicated, block: B:89:0x0165  */
    /* JADX WARN: Code duplicated, block: B:91:0x016b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0176  */
    /* JADX WARN: Code duplicated, block: B:97:0x0181  */
    public void z() {
        boolean z;
        byte b;
        la laVarV;
        int i;
        int i2;
        int i3;
        la laVarV2;
        boolean z2;
        boolean z3;
        Object obj;
        la laVar;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        rbd rbdVar = (rbd) this.b;
        v56 v56Var = (v56) this.e;
        v56 v56Var2 = (v56) this.f;
        ArrayList arrayList = (ArrayList) this.c;
        v56Var2.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((la) arrayList.get(size)).a == 8) {
                    if (z4) {
                        break;
                    }
                } else {
                    z4 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i12 = size + 1;
            ma maVar = (ma) v56Var2.b;
            rbd rbdVar2 = (rbd) maVar.b;
            la laVar2 = (la) arrayList.get(size);
            la laVar3 = (la) arrayList.get(i12);
            int i13 = laVar3.a;
            if (i13 == 1) {
                int i14 = laVar2.d;
                int i15 = laVar3.b;
                int i16 = i14 < i15 ? -1 : 0;
                int i17 = laVar2.b;
                if (i17 < i15) {
                    i16++;
                }
                if (i15 <= i17) {
                    laVar2.b = i17 + laVar3.d;
                }
                int i18 = laVar3.b;
                if (i18 <= i14) {
                    laVar2.d = i14 + laVar3.d;
                }
                laVar3.b = i18 + i16;
                arrayList.set(size, laVar3);
                arrayList.set(i12, laVar2);
            } else if (i13 == 2) {
                int i19 = laVar2.b;
                int i20 = laVar2.d;
                int i21 = laVar3.b;
                if (i19 < i20) {
                    if (i21 == i19 && laVar3.d == i20 - i19) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i21 == i20 + 1 && laVar3.d == i19 - i20) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i20 < i21) {
                    laVar3.b = i21 - 1;
                } else {
                    int i22 = laVar3.d;
                    if (i20 < i21 + i22) {
                        laVar3.d = i22 - 1;
                        laVar2.a = 2;
                        laVar2.d = 1;
                        if (laVar3.d == 0) {
                            arrayList.remove(i12);
                            laVar3.c = null;
                            rbdVar2.d(laVar3);
                        }
                    }
                }
                int i23 = laVar2.b;
                int i24 = laVar3.b;
                if (i23 <= i24) {
                    laVar3.b = i24 + 1;
                } else {
                    int i25 = i24 + laVar3.d;
                    if (i23 < i25) {
                        obj = null;
                        la laVarV3 = maVar.v(null, 2, i23 + 1, i25 - i23);
                        laVar3.d = laVar2.b - laVar3.b;
                        laVar = laVarV3;
                    }
                    if (z3) {
                        arrayList.set(size, laVar3);
                        arrayList.remove(i12);
                        laVar2.c = obj;
                        rbdVar2.d(laVar2);
                    } else {
                        if (z2) {
                            if (laVar != null) {
                                i10 = laVar2.b;
                                if (i10 > laVar.b) {
                                    laVar2.b = i10 - laVar.d;
                                }
                                i11 = laVar2.d;
                                if (i11 > laVar.b) {
                                    laVar2.d = i11 - laVar.d;
                                }
                            }
                            i8 = laVar2.b;
                            if (i8 > laVar3.b) {
                                laVar2.b = i8 - laVar3.d;
                            }
                            i9 = laVar2.d;
                            if (i9 > laVar3.b) {
                                laVar2.d = i9 - laVar3.d;
                            }
                        } else {
                            if (laVar != null) {
                                i6 = laVar2.b;
                                if (i6 >= laVar.b) {
                                    laVar2.b = i6 - laVar.d;
                                }
                                i7 = laVar2.d;
                                if (i7 >= laVar.b) {
                                    laVar2.d = i7 - laVar.d;
                                }
                            }
                            i4 = laVar2.b;
                            if (i4 >= laVar3.b) {
                                laVar2.b = i4 - laVar3.d;
                            }
                            i5 = laVar2.d;
                            if (i5 >= laVar3.b) {
                                laVar2.d = i5 - laVar3.d;
                            }
                        }
                        arrayList.set(size, laVar3);
                        if (laVar2.b != laVar2.d) {
                            arrayList.set(i12, laVar2);
                        } else {
                            arrayList.remove(i12);
                        }
                        if (laVar != null) {
                            arrayList.add(size, laVar);
                        }
                    }
                }
                obj = null;
                laVar = null;
                if (z3) {
                    arrayList.set(size, laVar3);
                    arrayList.remove(i12);
                    laVar2.c = obj;
                    rbdVar2.d(laVar2);
                } else {
                    if (z2) {
                        if (laVar != null) {
                            i10 = laVar2.b;
                            if (i10 > laVar.b) {
                                laVar2.b = i10 - laVar.d;
                            }
                            i11 = laVar2.d;
                            if (i11 > laVar.b) {
                                laVar2.d = i11 - laVar.d;
                            }
                        }
                        i8 = laVar2.b;
                        if (i8 > laVar3.b) {
                            laVar2.b = i8 - laVar3.d;
                        }
                        i9 = laVar2.d;
                        if (i9 > laVar3.b) {
                            laVar2.d = i9 - laVar3.d;
                        }
                    } else {
                        if (laVar != null) {
                            i6 = laVar2.b;
                            if (i6 >= laVar.b) {
                                laVar2.b = i6 - laVar.d;
                            }
                            i7 = laVar2.d;
                            if (i7 >= laVar.b) {
                                laVar2.d = i7 - laVar.d;
                            }
                        }
                        i4 = laVar2.b;
                        if (i4 >= laVar3.b) {
                            laVar2.b = i4 - laVar3.d;
                        }
                        i5 = laVar2.d;
                        if (i5 >= laVar3.b) {
                            laVar2.d = i5 - laVar3.d;
                        }
                    }
                    arrayList.set(size, laVar3);
                    if (laVar2.b != laVar2.d) {
                        arrayList.set(i12, laVar2);
                    } else {
                        arrayList.remove(i12);
                    }
                    if (laVar != null) {
                        arrayList.add(size, laVar);
                    }
                }
            } else if (i13 == 4) {
                int i26 = laVar2.d;
                int i27 = laVar3.b;
                if (i26 < i27) {
                    laVar3.b = i27 - 1;
                } else {
                    int i28 = laVar3.d;
                    if (i26 < i27 + i28) {
                        laVar3.d = i28 - 1;
                        laVarV = maVar.v(laVar3.c, 4, laVar2.b, 1);
                    }
                    i = laVar2.b;
                    i2 = laVar3.b;
                    if (i <= i2) {
                        laVar3.b = i2 + 1;
                    } else {
                        i3 = i2 + laVar3.d;
                        if (i < i3) {
                            int i29 = i3 - i;
                            laVarV2 = maVar.v(laVar3.c, 4, i + 1, i29);
                            laVar3.d -= i29;
                        }
                        arrayList.set(i12, laVar2);
                        if (laVar3.d > 0) {
                            arrayList.set(size, laVar3);
                        } else {
                            arrayList.remove(size);
                            laVar3.c = null;
                            rbdVar2.d(laVar3);
                        }
                        if (laVarV != null) {
                            arrayList.add(size, laVarV);
                        }
                        if (laVarV2 != null) {
                            arrayList.add(size, laVarV2);
                        }
                    }
                    laVarV2 = null;
                    arrayList.set(i12, laVar2);
                    if (laVar3.d > 0) {
                        arrayList.set(size, laVar3);
                    } else {
                        arrayList.remove(size);
                        laVar3.c = null;
                        rbdVar2.d(laVar3);
                    }
                    if (laVarV != null) {
                        arrayList.add(size, laVarV);
                    }
                    if (laVarV2 != null) {
                        arrayList.add(size, laVarV2);
                    }
                }
                laVarV = null;
                i = laVar2.b;
                i2 = laVar3.b;
                if (i <= i2) {
                    laVar3.b = i2 + 1;
                } else {
                    i3 = i2 + laVar3.d;
                    if (i < i3) {
                        int i210 = i3 - i;
                        laVarV2 = maVar.v(laVar3.c, 4, i + 1, i210);
                        laVar3.d -= i210;
                    }
                    arrayList.set(i12, laVar2);
                    if (laVar3.d > 0) {
                        arrayList.set(size, laVar3);
                    } else {
                        arrayList.remove(size);
                        laVar3.c = null;
                        rbdVar2.d(laVar3);
                    }
                    if (laVarV != null) {
                        arrayList.add(size, laVarV);
                    }
                    if (laVarV2 != null) {
                        arrayList.add(size, laVarV2);
                    }
                }
                laVarV2 = null;
                arrayList.set(i12, laVar2);
                if (laVar3.d > 0) {
                    arrayList.set(size, laVar3);
                } else {
                    arrayList.remove(size);
                    laVar3.c = null;
                    rbdVar2.d(laVar3);
                }
                if (laVarV != null) {
                    arrayList.add(size, laVarV);
                }
                if (laVarV2 != null) {
                    arrayList.add(size, laVarV2);
                }
            }
        }
        int size2 = arrayList.size();
        for (int i30 = 0; i30 < size2; i30++) {
            la laVarV4 = (la) arrayList.get(i30);
            int i31 = laVarV4.a;
            if (i31 == 1) {
                y(laVarV4);
            } else if (i31 == 2) {
                int i32 = laVarV4.b;
                int i33 = laVarV4.d + i32;
                int i34 = i32;
                int i35 = 0;
                byte b2 = -1;
                while (i34 < i33) {
                    if (v56Var.y(i34) != null || j(i34)) {
                        if (b2 == 0) {
                            m(v(null, 2, i32, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b2 == 1) {
                            y(v(null, 2, i32, i35));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i34 -= i35;
                        i33 -= i35;
                        i35 = 1;
                    } else {
                        i35++;
                    }
                    i34++;
                    b2 = b;
                }
                if (i35 != laVarV4.d) {
                    laVarV4.c = null;
                    rbdVar.d(laVarV4);
                    laVarV4 = v(null, 2, i32, i35);
                }
                if (b2 == 0) {
                    m(laVarV4);
                } else {
                    y(laVarV4);
                }
            } else if (i31 == 4) {
                int i36 = laVarV4.b;
                int i37 = laVarV4.d + i36;
                int i38 = i36;
                int i39 = 0;
                byte b3 = -1;
                while (i36 < i37) {
                    if (v56Var.y(i36) != null || j(i36)) {
                        if (b3 == 0) {
                            m(v(laVarV4.c, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 1;
                    } else {
                        if (b3 == 1) {
                            y(v(laVarV4.c, 4, i38, i39));
                            i38 = i36;
                            i39 = 0;
                        }
                        b3 = 0;
                    }
                    i39++;
                    i36++;
                }
                if (i39 != laVarV4.d) {
                    Object obj2 = laVarV4.c;
                    laVarV4.c = null;
                    rbdVar.d(laVarV4);
                    laVarV4 = v(obj2, 4, i38, i39);
                }
                if (b3 == 0) {
                    m(laVarV4);
                } else {
                    y(laVarV4);
                }
            } else if (i31 == 8) {
                y(laVarV4);
            }
        }
        arrayList.clear();
    }

    public ma(View view) {
        this.a = -1;
        this.b = view;
        this.c = xr.a();
    }

    public ma(qsb qsbVar, c9e c9eVar, u8e u8eVar, s8e s8eVar) {
        this.b = qsbVar;
        this.c = c9eVar;
        this.d = u8eVar;
        this.e = s8eVar;
        this.f = new xp3(u8eVar);
    }

    public ma(v56 v56Var) {
        this.b = new rbd(30);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = 0;
        this.e = v56Var;
        this.f = new v56(14, this);
    }

    public ma(Object obj, Looper looper, Looper looper2, qt3 qt3Var, pf6 pf6Var) {
        nfh nfhVar = (nfh) qt3Var;
        this.b = nfhVar.a(looper, null);
        this.c = nfhVar.a(looper2, null);
        this.e = obj;
        this.f = obj;
        this.d = pf6Var;
    }
}
