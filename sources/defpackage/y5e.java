package defpackage;

import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes4.dex */
public final class y5e extends ViewGroup {
    public static final /* synthetic */ zv8[] o;
    public cf7 a;
    public t5e b;
    public boolean c;
    public final t5d d;
    public final f8b e;
    public af7 f;
    public final TransitionSet g;
    public final c9b h;
    public final c9b i;
    public final c9b j;
    public int k;
    public int l;
    public final w5e[] m;
    public final ps0 n;

    static {
        z8b z8bVar = new z8b(y5e.class, "isStackFromEnd", "isStackFromEnd()Z");
        zfe.a.getClass();
        o = new zv8[]{z8bVar};
    }

    public y5e(Context context) {
        super(context);
        this.d = new t5d(this);
        this.e = new f8b();
        this.f = new tyd(7);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new m6e(new x5e(this, 1)));
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.setOrdering(1);
        transitionSet.addListener((Transition.TransitionListener) new g97(1, this));
        this.g = transitionSet;
        this.h = new c9b();
        this.i = new c9b();
        this.j = new c9b();
        int i = n6e.a;
        this.l = i;
        w5e[] w5eVarArr = new w5e[i];
        for (int i2 = 0; i2 < i; i2++) {
            w5eVarArr[i2] = null;
        }
        this.m = w5eVarArr;
        this.n = new ps0(22);
    }

    public final void a(c9b c9bVar) {
        Object[] objArr = c9bVar.b;
        long[] jArr = c9bVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        View view = (View) objArr[(i << 3) + i3];
                        this.e.a(view.getId());
                        this.g.addTarget(view.getId());
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final int b(int i) {
        zv8 zv8Var = o[0];
        if (!((Boolean) this.d.b).booleanValue()) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            w5e w5eVar = (w5e) a.d1(this.m, i);
            if (w5eVar == null) {
                break;
            }
            int measuredWidth = w5eVar.getMeasuredWidth() + (i2 == 0 ? 0 : gm0.K(4.0f * yl5.d().getDisplayMetrics().density)) + i2;
            if (measuredWidth > getMeasuredWidth()) {
                break;
            }
            i++;
            i2 = measuredWidth;
        }
        return getMeasuredWidth() - i2;
    }

    public final void c() {
        this.h.b();
        this.i.b();
        this.j.b();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    public final void d() {
        char c;
        long j;
        long j2;
        long j3;
        char c2;
        t5e t5eVar = this.b;
        if (t5eVar == null) {
            return;
        }
        c9b c9bVar = this.h;
        char c3 = 7;
        long j4 = -9187201950435737472L;
        int i = 8;
        if (c9bVar.d != 0) {
            Object[] objArr = c9bVar.b;
            long[] jArr = c9bVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr[i2];
                    j3 = 255;
                    if ((((~j5) << c3) & j5 & j4) != j4) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        int i4 = 0;
                        while (i4 < i3) {
                            if ((j5 & 255) < 128) {
                                View view = (View) objArr[(i2 << 3) + i4];
                                c2 = c3;
                                w5e w5eVar = view instanceof w5e ? (w5e) view : null;
                                if (w5eVar != null) {
                                    fv9 fv9Var = (fv9) t5eVar;
                                    ((qpa) fv9Var.b).k.i(Long.valueOf(((tea) ((uka) fv9Var.c)).A), w5eVar.getReaction(), w5eVar);
                                }
                                j5 >>= i;
                                i4++;
                                c3 = c2;
                                j4 = j4;
                                i = i;
                            } else {
                                c2 = c3;
                            }
                            j5 >>= i;
                            i4++;
                            c3 = c2;
                            j4 = j4;
                            i = i;
                        }
                        c = c3;
                        j = j4;
                        if (i3 != i) {
                            break;
                        }
                    } else {
                        c = c3;
                        j = j4;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    c3 = c;
                    j4 = j;
                    i = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        c9b c9bVar2 = this.j;
        if (c9bVar2.d == 0) {
            return;
        }
        Object[] objArr2 = c9bVar2.b;
        long[] jArr2 = c9bVar2.a;
        int length2 = jArr2.length - 2;
        if (length2 < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j6 = jArr2[i5];
            if ((((~j6) << c) & j6 & j) != j) {
                int i6 = 8 - ((~(i5 - length2)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((j6 & j3) < j2) {
                        View view2 = (View) objArr2[(i5 << 3) + i7];
                        w5e w5eVar2 = view2 instanceof w5e ? (w5e) view2 : null;
                        if (w5eVar2 != null) {
                            fv9 fv9Var2 = (fv9) t5eVar;
                            ((qpa) fv9Var2.b).k.i(Long.valueOf(((tea) ((uka) fv9Var2.c)).A), w5eVar2.getReaction(), w5eVar2);
                        }
                    }
                    j6 >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i5 == length2) {
                return;
            } else {
                i5++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    public final void e() {
        f8b f8bVar = this.e;
        int[] iArr = f8bVar.b;
        long[] jArr = f8bVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
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
                            this.g.removeTarget(iArr[(i << 3) + i3]);
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
        f8bVar.c();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01fe A[LOOP:6: B:90:0x01d0->B:100:0x01fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x0236 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0238 A[LOOP:8: B:104:0x020a->B:114:0x0238, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x028b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x028d A[LOOP:10: B:120:0x025f->B:130:0x028d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x02e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x02ea A[LOOP:12: B:140:0x02bc->B:150:0x02ea, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:162:0x00cc A[EDGE_INSN: B:162:0x00cc->B:41:0x00cc BREAK  A[LOOP:2: B:30:0x009b->B:40:0x00c9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0201 A[EDGE_INSN: B:177:0x0201->B:101:0x0201 BREAK  A[LOOP:6: B:90:0x01d0->B:100:0x01fe], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x023b A[EDGE_INSN: B:182:0x023b->B:115:0x023b BREAK  A[LOOP:8: B:104:0x020a->B:114:0x0238], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x0290 A[EDGE_INSN: B:187:0x0290->B:131:0x0290 BREAK  A[LOOP:10: B:120:0x025f->B:130:0x028d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x02ed A[EDGE_INSN: B:192:0x02ed->B:151:0x02ed BREAK  A[LOOP:12: B:140:0x02bc->B:150:0x02ea], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9 A[LOOP:2: B:30:0x009b->B:40:0x00c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x01fc A[DONT_INVERT] */
    public final void f(kja kjaVar, int i, boolean z) {
        long j;
        char c;
        long j2;
        long j3;
        pw pwVar;
        if (getChildCount() == 0 && (kjaVar == null || kjaVar.a.isEmpty())) {
            return;
        }
        this.k++;
        this.l = i;
        TransitionManager.endTransitions(this);
        c9b c9bVar = this.h;
        Object[] objArr = c9bVar.b;
        long[] jArr = c9bVar.a;
        int i2 = 2;
        int length = jArr.length - 2;
        long j4 = -9187201950435737472L;
        if (length >= 0) {
            int i3 = 0;
            c = 7;
            j2 = 255;
            while (true) {
                long j5 = jArr[i3];
                j3 = 128;
                if ((((~j5) << 7) & j5 & j4) != j4) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j5 & 255) < 128) {
                            View view = (View) objArr[(i3 << 3) + i5];
                            view.setVisibility(0);
                            view.setAlpha(1.0f);
                            view.setScaleX(1.0f);
                            view.setScaleY(1.0f);
                        }
                        j5 >>= 8;
                        i5++;
                        j4 = j4;
                    }
                    j = j4;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    j = j4;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                j4 = j;
            }
        } else {
            j = -9187201950435737472L;
            c = 7;
            j2 = 255;
            j3 = 128;
        }
        c9b c9bVar2 = this.i;
        Object[] objArr2 = c9bVar2.b;
        long[] jArr2 = c9bVar2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i6 = 0;
            while (true) {
                long j6 = jArr2[i6];
                if ((((~j6) << c) & j6 & j) == j) {
                    if (i6 != length2) {
                        break;
                        break;
                    }
                    i6++;
                } else {
                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((j6 & j2) < j3) {
                            removeView((View) objArr2[(i6 << 3) + i8]);
                        }
                        j6 >>= 8;
                    }
                    if (i7 != 8) {
                        break;
                    } else if (i6 != length2) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
        }
        e();
        c();
        setVisibility(getChildCount() > 0 ? 0 : 8);
        c9b c9bVar3 = this.j;
        if (kjaVar != null) {
            z5e z5eVar = kjaVar.c;
            List<jja> list = kjaVar.a;
            if (list != null) {
                for (jja jjaVar : list) {
                    z5e z5eVar2 = jjaVar.a;
                    int i9 = jjaVar.b;
                    s5e s5eVar = z5eVar2.b;
                    s5e s5eVar2 = z5eVar2.b;
                    w5e w5eVar = (w5e) findViewById(s5eVar.a.toString().hashCode());
                    if (w5eVar == null) {
                        w5e w5eVar2 = new w5e(getContext());
                        w5eVar2.setId(s5eVar2.a.toString().hashCode());
                        w5eVar2.setReaction(s5eVar2);
                        w5eVar2.setCount(i9);
                        w5eVar2.setOwn(cqk.d(s5eVar2, z5eVar != null ? z5eVar.b : null));
                        cf7 cf7Var = this.a;
                        if (cf7Var != null) {
                            w5eVar2.setOnChipClickListener(cf7Var);
                        }
                        addView(w5eVar2);
                        c9bVar.a(w5eVar2);
                    } else {
                        w5eVar.setOwn(cqk.d(s5eVar2, z5eVar != null ? z5eVar.b : null));
                        w5eVar.setCount(i9);
                        c9bVar3.a(w5eVar);
                    }
                }
            }
        }
        if (kjaVar == null) {
            pwVar = new pw(0);
        } else {
            List list2 = kjaVar.a;
            pw pwVar2 = new pw(0);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                pwVar2.add(Integer.valueOf(((jja) it.next()).a.b.a.toString().hashCode()));
            }
            pwVar = pwVar2;
        }
        int i10 = 0;
        while (i10 < getChildCount()) {
            int i11 = i10 + 1;
            View childAt = getChildAt(i10);
            if (childAt == null) {
                ore.i();
                return;
            } else {
                if (!pwVar.contains(Integer.valueOf(childAt.getId()))) {
                    c9bVar2.a(childAt);
                }
                i10 = i11;
            }
        }
        if (!z) {
            d();
            Object[] objArr3 = c9bVar2.b;
            long[] jArr3 = c9bVar2.a;
            int length3 = jArr3.length - 2;
            if (length3 >= 0) {
                int i12 = 0;
                while (true) {
                    long j7 = jArr3[i12];
                    if ((((~j7) << c) & j7 & j) == j) {
                        if (i12 != length3) {
                            break;
                            break;
                        }
                        i12++;
                    } else {
                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                        for (int i14 = 0; i14 < i13; i14++) {
                            if ((j7 & j2) < j3) {
                                removeView((View) objArr3[(i12 << 3) + i14]);
                            }
                            j7 >>= 8;
                        }
                        if (i13 != 8) {
                            break;
                        } else if (i12 != length3) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
            setVisibility(getChildCount() > 0 ? 0 : 8);
            c();
            return;
        }
        if (c9bVar2.d == 0 || c9bVar.d == 0) {
            int i15 = this.k;
            setVisibility(0);
            a(c9bVar2);
            a(c9bVar);
            Object[] objArr4 = c9bVar.b;
            long[] jArr4 = c9bVar.a;
            int length4 = jArr4.length - 2;
            if (length4 >= 0) {
                int i16 = 0;
                while (true) {
                    long j8 = jArr4[i16];
                    if ((((~j8) << c) & j8 & j) == j) {
                        if (i16 != length4) {
                            break;
                            break;
                        }
                        i16++;
                    } else {
                        int i17 = 8 - ((~(i16 - length4)) >>> 31);
                        for (int i18 = 0; i18 < i17; i18++) {
                            if ((j8 & j2) < j3) {
                                ((View) objArr4[(i16 << 3) + i18]).setVisibility(8);
                            }
                            j8 >>= 8;
                        }
                        if (i17 != 8) {
                            break;
                        } else if (i16 != length4) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                }
            }
            this.f = new x5e(this, 0);
            gba gbaVar = new gba(i15, this, i2);
            if (isLaidOut()) {
                gbaVar.invoke();
                return;
            } else {
                n9j.b(this, new t86(gbaVar, i15, this, 3));
                return;
            }
        }
        a(c9bVar3);
        Object[] objArr5 = c9bVar2.b;
        long[] jArr5 = c9bVar2.a;
        int length5 = jArr5.length - 2;
        if (length5 >= 0) {
            int i19 = 0;
            while (true) {
                long j9 = jArr5[i19];
                if ((((~j9) << c) & j9 & j) == j) {
                    if (i19 != length5) {
                        break;
                        break;
                    }
                    i19++;
                } else {
                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                    for (int i21 = 0; i21 < i20; i21++) {
                        if ((j9 & j2) < j3) {
                            removeView((View) objArr5[(i19 << 3) + i21]);
                        }
                        j9 >>= 8;
                    }
                    if (i20 != 8) {
                        break;
                    } else if (i19 != length5) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
        }
        Object[] objArr6 = c9bVar.b;
        long[] jArr6 = c9bVar.a;
        int length6 = jArr6.length - 2;
        if (length6 >= 0) {
            int i22 = 0;
            while (true) {
                long j10 = jArr6[i22];
                if ((((~j10) << c) & j10 & j) == j) {
                    if (i22 != length6) {
                        break;
                        break;
                    }
                    i22++;
                } else {
                    int i23 = 8 - ((~(i22 - length6)) >>> 31);
                    for (int i24 = 0; i24 < i23; i24++) {
                        if ((j10 & j2) < j3) {
                            ((View) objArr6[(i22 << 3) + i24]).setVisibility(0);
                        }
                        j10 >>= 8;
                    }
                    if (i23 != 8) {
                        break;
                    } else if (i22 != length6) {
                        break;
                    } else {
                        i22++;
                    }
                }
            }
        }
        this.f = new x5e(this, 2);
        TransitionManager.beginDelayedTransition(this, this.g);
        requestLayout();
    }

    public final t5e getChipObserver() {
        return this.b;
    }

    public final cf7 getOnChipClickListener() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iB;
        int childCount = getChildCount();
        int measuredWidth = 0;
        int measuredHeight = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            w5e w5eVar = (w5e) a.d1(this.m, i5);
            if (w5eVar != null) {
                int iB2 = measuredWidth == 0 ? b(i5) : gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
                if (getMeasuredWidth() - measuredWidth >= w5eVar.getMeasuredWidth() + iB2) {
                    iB = measuredWidth + iB2;
                    qyj.M(w5eVar, iB, measuredHeight, 0, 12);
                } else {
                    iB = b(i5);
                    measuredHeight += w5eVar.getMeasuredHeight() + gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                    qyj.M(w5eVar, iB, measuredHeight, 0, 12);
                }
                measuredWidth = iB + w5eVar.getMeasuredWidth();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View childAt;
        int childCount = getChildCount();
        int i3 = this.l;
        if (childCount > i3) {
            i3 = n6e.a;
        }
        int i4 = 0;
        while (true) {
            childAt = null;
            if (i4 >= i3) {
                break;
            }
            int childCount2 = getChildCount();
            w5e[] w5eVarArr = this.m;
            if (i4 < childCount2) {
                w5eVarArr[i4] = getChildAt(i4);
            } else {
                w5eVarArr[i4] = 0;
            }
            i4++;
        }
        Arrays.sort(this.m, this.n);
        int size = View.MeasureSpec.getMode(i) == 0 ? getContext().getResources().getDisplayMetrics().widthPixels : View.MeasureSpec.getSize(i);
        int childCount3 = getChildCount();
        int measuredWidth = 0;
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < childCount3; i6++) {
            w5e w5eVar = (w5e) a.d1(this.m, i6);
            if (w5eVar != null) {
                w5eVar.measure(i, i2);
                int measuredWidth2 = w5eVar.getMeasuredWidth() + measuredWidth + (measuredWidth == 0 ? 0 : gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                if (measuredWidth2 > size) {
                    i5++;
                    measuredWidth = w5eVar.getMeasuredWidth();
                } else {
                    measuredWidth = measuredWidth2;
                }
                iMax = Math.max(iMax, measuredWidth);
            }
        }
        if (measuredWidth == 0) {
            i5 = 0;
        }
        if ((getChildCount() > 0) && (childAt = getChildAt(0)) == null) {
            ore.i();
        } else {
            setMeasuredDimension(iMax, bc1.g(8.0f, yl5.d().getDisplayMetrics().density, i5, (i5 + 1) * (childAt != null ? childAt.getMeasuredHeight() : 0)));
        }
    }

    public final void setChipObserver(t5e t5eVar) {
        this.b = t5eVar;
    }

    public final void setIncoming(boolean z) {
        this.c = z;
    }

    public final void setOnChipClickListener(cf7 cf7Var) {
        this.a = cf7Var;
    }

    public final void setStackFromEnd(boolean z) {
        this.d.B(this, o[0], Boolean.valueOf(z));
    }
}
