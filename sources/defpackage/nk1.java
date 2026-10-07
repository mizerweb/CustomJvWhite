package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nk1 extends rb5 {
    public final ArrayList t = new ArrayList();
    public final b9b u;

    public nk1() {
        long[] jArr = q1f.a;
        this.u = new b9b();
        this.d = 280L;
        this.e = 280L;
    }

    @Override // defpackage.rb5, defpackage.see
    public final void d(lfe lfeVar) {
        this.t.remove(lfeVar);
        Animator animator = (Animator) this.u.m(lfeVar);
        if (animator != null) {
            animator.cancel();
        }
        View view = lfeVar.a;
        view.setAlpha(1.0f);
        view.setClipBounds(null);
        super.d(lfeVar);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb A[LOOP:2: B:24:0x008d->B:34:0x00bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x00be A[EDGE_INSN: B:47:0x00be->B:35:0x00be BREAK  A[LOOP:2: B:24:0x008d->B:34:0x00bb], SYNTHETIC] */
    @Override // defpackage.rb5, defpackage.see
    public final void e() {
        char c;
        long j;
        long j2;
        long j3;
        this.t.clear();
        b9b b9bVar = this.u;
        ArrayList arrayList = new ArrayList(b9bVar.e);
        Object[] objArr = b9bVar.b;
        long[] jArr = b9bVar.a;
        int length = jArr.length - 2;
        char c2 = 7;
        long j4 = -9187201950435737472L;
        if (length >= 0) {
            int i = 0;
            j2 = 128;
            while (true) {
                long j5 = jArr[i];
                j3 = 255;
                if ((((~j5) << c2) & j5 & j4) != j4) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j5 & 255) < 128) {
                            View view = ((lfe) objArr[(i << 3) + i3]).a;
                            view.setAlpha(1.0f);
                            view.setClipBounds(null);
                        }
                        j5 >>= 8;
                        i3++;
                        c2 = c2;
                        j4 = j4;
                    }
                    c = c2;
                    j = j4;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c2;
                    j = j4;
                }
                if (i == length) {
                    break;
                }
                i++;
                c2 = c;
                j4 = j;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        Object[] objArr2 = b9bVar.c;
        long[] jArr2 = b9bVar.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j6 = jArr2[i4];
                if ((((~j6) << c) & j6 & j) == j) {
                    if (i4 != length2) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j6 & j3) < j2) {
                            arrayList.add((Animator) objArr2[(i4 << 3) + i6]);
                        }
                        j6 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 != length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        b9bVar.g();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).cancel();
        }
        super.e();
    }

    @Override // defpackage.rb5, defpackage.see
    public final boolean g() {
        return !this.t.isEmpty() || this.u.f() || super.g();
    }

    @Override // defpackage.rb5, defpackage.see
    public final void h() {
        nk1 nk1Var;
        ArrayList arrayList = this.t;
        List<lfe> listT1 = ww3.T1(arrayList);
        arrayList.clear();
        for (lfe lfeVar : listT1) {
            View view = lfeVar.a;
            int height = view.getHeight();
            int width = view.getWidth();
            if (height <= 0 || width <= 0) {
                nk1Var = this;
                nk1Var.o(lfeVar);
                if (!nk1Var.g()) {
                    nk1Var.c();
                }
            } else {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.setDuration(this.d);
                valueAnimatorOfFloat.addUpdateListener(new lk1(view, width, height, 0));
                nk1Var = this;
                valueAnimatorOfFloat.addListener(new mk1(nk1Var, view, lfeVar, valueAnimatorOfFloat, 0));
                nk1Var.u.o(lfeVar, valueAnimatorOfFloat);
                valueAnimatorOfFloat.start();
            }
            this = nk1Var;
        }
        super.h();
    }

    @Override // defpackage.rb5
    public final boolean l(lfe lfeVar) {
        d(lfeVar);
        this.t.add(lfeVar);
        return true;
    }
}
