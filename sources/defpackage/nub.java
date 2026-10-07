package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.client.methods.HttpDelete;

/* JADX INFO: loaded from: classes.dex */
public final class nub {
    public static final String[] l = {"INSERT", "UPDATE", HttpDelete.METHOD_NAME};
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Serializable f;
    public final Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public nub(rre rreVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, oo3 oo3Var) {
        this.b = rreVar;
        this.c = linkedHashMap;
        this.d = linkedHashMap2;
        this.a = z;
        this.e = oo3Var;
        this.j = new AtomicBoolean(false);
        this.k = new t4i(0);
        this.f = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            ((LinkedHashMap) this.f).put(lowerCase, Integer.valueOf(i));
            String str2 = (String) ((LinkedHashMap) this.c).get(strArr[i]);
            String lowerCase2 = str2 != null ? str2.toLowerCase(locale) : null;
            if (lowerCase2 != null) {
                lowerCase = lowerCase2;
            }
            strArr2[i] = lowerCase;
        }
        this.g = strArr2;
        for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            if (((LinkedHashMap) this.f).containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) this.f;
                linkedHashMap3.put(lowerCase4, wm9.N0(linkedHashMap3, lowerCase3));
            }
        }
        this.h = new prb(((String[]) this.g).length);
        int length2 = ((String[]) this.g).length;
        w4 w4Var = new w4();
        w4Var.a = p90.a(new int[length2]);
        this.i = w4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(nub nubVar, gbd gbdVar, nq4 nq4Var) {
        u4i u4iVar;
        if (nq4Var instanceof u4i) {
            u4iVar = (u4i) nq4Var;
            int i = u4iVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                u4iVar.g = i - Integer.MIN_VALUE;
            } else {
                u4iVar = new u4i(nubVar, nq4Var);
            }
        } else {
            u4iVar = new u4i(nubVar, nq4Var);
        }
        Object objA = u4iVar.e;
        int i2 = u4iVar.g;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objA);
            nre nreVar = new nre(16);
            u4iVar.d = gbdVar;
            u4iVar.g = 1;
            objA = gbdVar.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1", nreVar, u4iVar);
            if (objA != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set = (Set) u4iVar.d;
            ch3.d0(objA);
            return set;
        }
        gbdVar = (gbd) u4iVar.d;
        ch3.d0(objA);
        Set set2 = (Set) objA;
        if (!set2.isEmpty()) {
            u4iVar.d = set2;
            u4iVar.g = 2;
            if (ch3.l(gbdVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", u4iVar) == hu4Var) {
                return hu4Var;
            }
        }
        return set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object b(nub nubVar, nq4 nq4Var) throws Throwable {
        w4i w4iVar;
        c46 c46Var;
        Object value;
        int[] iArr;
        rre rreVar = (rre) nubVar.b;
        if (nq4Var instanceof w4i) {
            w4iVar = (w4i) nq4Var;
            int i = w4iVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                w4iVar.g = i - Integer.MIN_VALUE;
            } else {
                w4iVar = new w4i(nubVar, nq4Var);
            }
        } else {
            w4iVar = new w4i(nubVar, nq4Var);
        }
        Object obj = w4iVar.e;
        int i2 = w4iVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            c46 c46Var2 = rreVar.g;
            boolean zE = c46Var2.e();
            c76 c76Var = c76.a;
            if (!zE) {
                return c76Var;
            }
            try {
                if (!((AtomicBoolean) nubVar.j).compareAndSet(true, false)) {
                    c46Var2.q();
                    return c76Var;
                }
                if (!((Boolean) ((af7) nubVar.k).invoke()).booleanValue()) {
                    c46Var2.q();
                    return c76Var;
                }
                x4i x4iVar = new x4i(nubVar, null, 1);
                w4iVar.d = c46Var2;
                w4iVar.g = 1;
                Object objQ = rreVar.q(false, x4iVar, w4iVar);
                hu4 hu4Var = hu4.a;
                if (objQ == hu4Var) {
                    return hu4Var;
                }
                c46Var = c46Var2;
                obj = objQ;
            } catch (Throwable th) {
                th = th;
                c46Var = c46Var2;
                c46Var.q();
                throw th;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c46Var = w4iVar.d;
            try {
                ch3.d0(obj);
            } catch (Throwable th2) {
                th = th2;
                c46Var.q();
                throw th;
            }
        }
        Set set = (Set) obj;
        if (!set.isEmpty()) {
            w4 w4Var = (w4) nubVar.i;
            w4Var.getClass();
            if (!set.isEmpty()) {
                mjg mjgVar = (mjg) w4Var.a;
                do {
                    value = mjgVar.getValue();
                    int[] iArr2 = (int[]) value;
                    int length = iArr2.length;
                    iArr = new int[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr[i3] = set.contains(Integer.valueOf(i3)) ? iArr2[i3] + 1 : iArr2[i3];
                    }
                } while (!mjgVar.h(value, iArr));
            }
            ((oo3) nubVar.e).invoke(set);
        }
        c46Var.q();
        return set;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0094  */
    /* JADX WARN: Code duplicated, block: B:24:0x0097  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (defpackage.ch3.l(r1, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00da, code lost:
    
        if (defpackage.ch3.l(r11, r3, r4) == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dc, code lost:
    
        return r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00da -> B:28:0x00dd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.nub r17, defpackage.pzh r18, int r19, defpackage.nq4 r20) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nub.c(nub, pzh, int, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0083 -> B:19:0x0086). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(defpackage.nub r7, defpackage.pzh r8, int r9, defpackage.nq4 r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.z4i
            if (r0 == 0) goto L16
            r0 = r10
            z4i r0 = (defpackage.z4i) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.k = r1
            goto L1b
        L16:
            z4i r0 = new z4i
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.i
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L34
            int r7 = r0.h
            int r8 = r0.g
            java.lang.String[] r9 = r0.f
            java.lang.String r1 = r0.e
            gbd r3 = r0.d
            defpackage.ch3.d0(r10)
            r10 = r9
            r9 = r3
            goto L86
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            r7 = 0
            return r7
        L3b:
            defpackage.ch3.d0(r10)
            java.lang.Object r7 = r7.g
            java.lang.String[] r7 = (java.lang.String[]) r7
            r7 = r7[r9]
            java.lang.String[] r9 = defpackage.nub.l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4f:
            if (r8 >= r7) goto L88
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "DROP TRIGGER IF EXISTS `"
            r5 = 96
            java.lang.String r3 = defpackage.qv1.g(r5, r4, r3)
            r0.d = r9
            r0.e = r1
            r0.f = r10
            r0.g = r8
            r0.h = r7
            r0.k = r2
            java.lang.Object r3 = defpackage.ch3.l(r9, r3, r0)
            hu4 r4 = defpackage.hu4.a
            if (r3 != r4) goto L86
            return r4
        L86:
            int r8 = r8 + r2
            goto L4f
        L88:
            sbi r7 = defpackage.sbi.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nub.d(nub, pzh, int, nq4):java.lang.Object");
    }

    public static void i(nub nubVar) {
        FrameLayout frameLayoutE = nubVar.e();
        View view = (View) nubVar.b;
        ijc ijcVar = new ijc(view.getContext());
        nubVar.i = ijcVar;
        int[] iArrF = nubVar.f();
        ijcVar.c(view, iArrF[0], iArrF[1]);
        frameLayoutE.addView(ijcVar, new FrameLayout.LayoutParams(-1, -1));
        ijcVar.b();
    }

    public FrameLayout e() {
        FrameLayout frameLayout = (FrameLayout) this.h;
        if (frameLayout != null) {
            return frameLayout;
        }
        FrameLayout frameLayout2 = new FrameLayout(((View) this.b).getContext());
        frameLayout2.setElevation(yl5.d().getDisplayMetrics().density * 12.0f);
        ((ViewGroup) this.c).addView(frameLayout2, new ViewGroup.LayoutParams(-1, -1));
        this.h = frameLayout2;
        return frameLayout2;
    }

    public int[] f() {
        ViewGroup viewGroup = (ViewGroup) this.c;
        int[] iArr = {viewGroup.getPaddingLeft() + i, viewGroup.getPaddingTop() + i};
        viewGroup.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return iArr;
    }

    public void g(af7 af7Var, af7 af7Var2) {
        if (((AtomicBoolean) this.j).compareAndSet(false, true)) {
            af7Var.invoke();
            dq4 dq4Var = ((rre) this.b).a;
            if (dq4Var == null) {
                dq4Var = null;
            }
            yab.i0(dq4Var, new du4("Room Invalidation Tracker Refresh"), 0, new fgh(this, af7Var2, null), 2);
        }
    }

    public void h() {
        bvb bvbVar = (bvb) this.j;
        if (bvbVar == null) {
            return;
        }
        this.j = null;
        FrameLayout frameLayout = (FrameLayout) this.h;
        if (frameLayout != null) {
            frameLayout.removeView(bvbVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x010a A[PHI: r20 r21
  0x010a: PHI (r20v11 int) = (r20v6 int), (r20v12 int) binds: [B:21:0x0114, B:17:0x0108] A[DONT_GENERATE, DONT_INLINE]
  0x010a: PHI (r21v7 ix2) = (r21v3 ix2), (r21v8 ix2) binds: [B:21:0x0114, B:17:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x010c A[PHI: r20 r21
  0x010c: PHI (r20v7 int) = (r20v6 int), (r20v12 int) binds: [B:21:0x0114, B:17:0x0108] A[DONT_GENERATE, DONT_INLINE]
  0x010c: PHI (r21v4 ix2) = (r21v3 ix2), (r21v8 ix2) binds: [B:21:0x0114, B:17:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    public void j(boolean z) {
        avb avbVar;
        xub xubVarK;
        int i;
        ix2 ix2Var;
        boolean z2;
        h();
        FrameLayout frameLayoutE = e();
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 8.0f);
        View view = (View) this.b;
        bvb bvbVar = new bvb(view.getContext());
        bvbVar.setText((ynh) this.d);
        tub tubVar = tub.a;
        bvbVar.setArrowSide(tubVar);
        bvbVar.setArrowAlignment(sub.a);
        final int i2 = 0;
        bvbVar.setOnCloseClickListener(new af7(this) { // from class: lub
            public final /* synthetic */ nub b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                sbi sbiVar = sbi.a;
                nub nubVar = this.b;
                switch (i3) {
                    case 0:
                        evb evbVar = (evb) nubVar.k;
                        if (evbVar != null) {
                            evbVar.i();
                        }
                        break;
                    default:
                        evb evbVar2 = (evb) nubVar.k;
                        if (evbVar2 != null) {
                            evbVar2.k();
                        }
                        break;
                }
                return sbiVar;
            }
        });
        final int i3 = 1;
        bvbVar.setOnTooltipClickListener(new af7(this) { // from class: lub
            public final /* synthetic */ nub b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                sbi sbiVar = sbi.a;
                nub nubVar = this.b;
                switch (i4) {
                    case 0:
                        evb evbVar = (evb) nubVar.k;
                        if (evbVar != null) {
                            evbVar.i();
                        }
                        break;
                    default:
                        evb evbVar2 = (evb) nubVar.k;
                        if (evbVar2 != null) {
                            evbVar2.k();
                        }
                        break;
                }
                return sbiVar;
            }
        });
        avb avbVar2 = bvbVar.f;
        avbVar2.measure(0, 0);
        int measuredBodyWidth = bvbVar.getMeasuredBodyWidth();
        int measuredBodyHeight = bvbVar.getMeasuredBodyHeight();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArrF = f();
        int i4 = iArr[0] - iArrF[0];
        int i5 = iArr[1] - iArrF[1];
        ViewGroup viewGroup = (ViewGroup) this.c;
        Rect rect = new Rect(0, 0, (viewGroup.getWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight(), (viewGroup.getHeight() - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom());
        qe7 qe7Var = (qe7) this.e;
        boolean z3 = qe7Var instanceof wub;
        Object obj = this.g;
        if (z3) {
            ix2 ix2Var2 = (ix2) obj;
            int width = view.getWidth();
            int height = view.getHeight();
            int iK2 = gm0.K(yl5.d().getDisplayMetrics().density * 2.0f);
            wub wubVar = (wub) qe7Var;
            tub tubVar2 = wubVar.g;
            sub subVar = wubVar.h;
            ix2Var2.getClass();
            int i6 = i5 + height;
            int i7 = (width / 2) + i4;
            int i8 = iK2 * 2;
            int i9 = measuredBodyHeight + iK + i8;
            int i10 = measuredBodyWidth + iK + i8;
            boolean z4 = tubVar2 == tubVar;
            int i11 = ix2Var2.b;
            int i12 = z4 ? i6 + i11 : (i5 - i11) - i9;
            int iA = (int) (i7 - ix2.a(subVar, i10, iK2));
            if (z4) {
                i = iK2;
                int i13 = i12 + i9;
                ix2Var = ix2Var2;
                if (i13 <= rect.bottom) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                i = iK2;
                ix2Var = ix2Var2;
                if (i12 >= rect.top) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            boolean z5 = iA >= rect.left && i10 + iA <= rect.right;
            if (z2 && z5) {
                xubVarK = new xub(iA, i12, tubVar2, subVar, (subVar != sub.c ? !z4 : z4) ? 2.0f : -2.0f);
                avbVar = avbVar2;
            } else {
                avbVar = avbVar2;
                xubVarK = ix2Var.k(i4, i5, width, height, rect, measuredBodyWidth, measuredBodyHeight, iK, i);
            }
        } else {
            avbVar = avbVar2;
            if (!(qe7Var instanceof vub)) {
                ore.o();
                return;
            }
            xubVarK = ((ix2) obj).k(i4, i5, view.getWidth(), view.getHeight(), rect, measuredBodyWidth, measuredBodyHeight, iK, gm0.K(yl5.d().getDisplayMetrics().density * 2.0f));
        }
        xub xubVar = xubVarK;
        float f = xubVar.e;
        tub tubVar3 = xubVar.c;
        bvbVar.c.d(tubVar3, xubVar.d);
        avbVar.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f) + (tubVar3 == tubVar ? gm0.K(yl5.d().getDisplayMetrics().density * 8.0f) : 0), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(10.0f * yl5.d().getDisplayMetrics().density) + (tubVar3 == tub.b ? gm0.K(yl5.d().getDisplayMetrics().density * 8.0f) : 0));
        bvbVar.n = f;
        int measuredWidth = avbVar.getMeasuredWidth();
        int measuredHeight = avbVar.getMeasuredHeight();
        float fSin = 0.0f;
        if (f != 0.0f) {
            fSin = (float) ((Math.sin(Math.toRadians(Math.abs(f))) * ((double) (measuredWidth + measuredHeight))) / 2.0d);
        }
        bvbVar.setPadding((int) (gm0.K(yl5.d().getDisplayMetrics().density * 2.0f) + fSin), (int) (gm0.K(yl5.d().getDisplayMetrics().density * 2.0f) + fSin), (int) (gm0.K(yl5.d().getDisplayMetrics().density * 2.0f) + fSin), (int) (gm0.K(2.0f * yl5.d().getDisplayMetrics().density) + fSin));
        this.j = bvbVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = xubVar.a;
        layoutParams.topMargin = xubVar.b;
        frameLayoutE.addView(bvbVar, layoutParams);
        if (z) {
            bvbVar.c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object k(nq4 nq4Var) throws Throwable {
        a5i a5iVar;
        Throwable th;
        c46 c46Var;
        rre rreVar = (rre) this.b;
        if (nq4Var instanceof a5i) {
            a5iVar = (a5i) nq4Var;
            int i = a5iVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                a5iVar.g = i - Integer.MIN_VALUE;
            } else {
                a5iVar = new a5i(this, nq4Var);
            }
        } else {
            a5iVar = new a5i(this, nq4Var);
        }
        Object obj = a5iVar.e;
        int i2 = a5iVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            c46 c46Var2 = rreVar.g;
            if (c46Var2.e()) {
                try {
                    gz gzVar = new gz(this, null, 17);
                    a5iVar.d = c46Var2;
                    a5iVar.g = 1;
                    Object objQ = rreVar.q(false, gzVar, a5iVar);
                    hu4 hu4Var = hu4.a;
                    if (objQ == hu4Var) {
                        return hu4Var;
                    }
                    c46Var = c46Var2;
                    c46Var.q();
                } catch (Throwable th2) {
                    th = th2;
                    c46Var = c46Var2;
                    c46Var.q();
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c46Var = a5iVar.d;
            try {
                ch3.d0(obj);
                c46Var.q();
            } catch (Throwable th3) {
                th = th3;
                c46Var.q();
                throw th;
            }
        }
        return sbi.a;
    }

    public ylc l(String[] strArr) {
        gof gofVar = new gof();
        for (String str : strArr) {
            Set set = (Set) ((LinkedHashMap) this.d).get(str.toLowerCase(Locale.ROOT));
            if (set != null) {
                gofVar.addAll(set);
            } else {
                gofVar.add(str);
            }
        }
        String[] strArr2 = (String[]) p90.e(gofVar).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            Integer num = (Integer) ((LinkedHashMap) this.f).get(str2.toLowerCase(Locale.ROOT));
            if (num == null) {
                ore.p("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i] = num.intValue();
        }
        return new ylc(strArr2, iArr);
    }

    public nub(View view, ViewGroup viewGroup, ynh ynhVar, qe7 qe7Var) {
        this.b = view;
        this.c = viewGroup;
        this.d = ynhVar;
        this.e = qe7Var;
        this.f = nub.class.getName();
        this.g = new ix2(gm0.K(4.0f * yl5.d().getDisplayMetrics().density), 2);
    }
}
