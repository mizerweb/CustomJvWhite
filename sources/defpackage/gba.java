package defpackage;

import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gba implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gba(int i, ViewGroup viewGroup, int i2) {
        this.a = i2;
        this.b = i;
        this.c = viewGroup;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d5 A[LOOP:2: B:39:0x00a9->B:49:0x00d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x00d8 A[SYNTHETIC] */
    @Override // defpackage.af7
    public final Object invoke() {
        long j;
        long j2;
        switch (this.a) {
            case 0:
                lba lbaVar = (lba) this.c;
                int i = this.b;
                oba obaVar = i != -2 ? i != -1 ? oba.TRIM : oba.DEBUG : oba.INTERVAL;
                if (fba.b(i) || i == -2) {
                    i = Integer.MIN_VALUE;
                }
                return lbaVar.c(obaVar, i);
            case 1:
                MessagesLayoutManager messagesLayoutManager = (MessagesLayoutManager) this.c;
                int i2 = this.b;
                je9 je9Var = je9.d;
                View viewR = messagesLayoutManager.r(i2);
                if (viewR != null) {
                    String str = messagesLayoutManager.E;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        int iG = messagesLayoutManager.G();
                        i5f i5fVar = messagesLayoutManager.F;
                        StringBuilder sbP = qv1.p("LM scroll to inflated view after redraw by pos:", i2, ", curSize:", iG, ", alignment: ");
                        sbP.append(i5fVar);
                        a4cVar.c(je9Var, str, sbP.toString(), null);
                    }
                    if (messagesLayoutManager.G) {
                        messagesLayoutManager.G = false;
                        String str2 = messagesLayoutManager.E;
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                            int iG2 = messagesLayoutManager.G();
                            i5f i5fVar2 = messagesLayoutManager.F;
                            StringBuilder sbP2 = qv1.p("LM ignore scroll to inflated view after redraw by pos:", i2, ", curSize:", iG2, ", alignment: ");
                            sbP2.append(i5fVar2);
                            a4cVar2.c(je9Var, str2, sbP2.toString(), null);
                        }
                    } else {
                        messagesLayoutManager.y1(viewR, i2);
                    }
                }
                messagesLayoutManager.I = false;
                return Boolean.FALSE;
            case 2:
                int i3 = this.b;
                y5e y5eVar = (y5e) this.c;
                int i4 = y5eVar.k;
                c9b c9bVar = y5eVar.i;
                c9b c9bVar2 = y5eVar.h;
                if (i3 == i4) {
                    TransitionManager.beginDelayedTransition(y5eVar, y5eVar.g);
                    if (c9bVar2.d == 0 && c9bVar.d == 0) {
                        y5eVar.requestLayout();
                    } else {
                        Object[] objArr = c9bVar2.b;
                        long[] jArr = c9bVar2.a;
                        int length = jArr.length - 2;
                        long j3 = 255;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j4 = jArr[i5];
                                j2 = 128;
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                                    int i7 = 0;
                                    while (i7 < i6) {
                                        if ((j4 & j3) < 128) {
                                            ((View) objArr[(i5 << 3) + i7]).setVisibility(0);
                                        }
                                        j4 >>= 8;
                                        i7++;
                                        j3 = j3;
                                    }
                                    j = j3;
                                    if (i6 == 8) {
                                    }
                                } else {
                                    j = j3;
                                }
                                if (i5 != length) {
                                    i5++;
                                    j3 = j;
                                }
                            }
                        } else {
                            j = 255;
                            j2 = 128;
                        }
                        Object[] objArr2 = c9bVar.b;
                        long[] jArr2 = c9bVar.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i8 = 0;
                            while (true) {
                                long j5 = jArr2[i8];
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        if ((j5 & j) < j2) {
                                            ((View) objArr2[(i8 << 3) + i10]).setVisibility(8);
                                        }
                                        j5 >>= 8;
                                    }
                                    if (i9 == 8) {
                                        if (i8 != length2) {
                                            i8++;
                                        }
                                    }
                                } else if (i8 != length2) {
                                    i8++;
                                }
                            }
                        }
                    }
                }
                return sbi.a;
            default:
                int i11 = this.b;
                u0i u0iVar = (u0i) this.c;
                int i12 = r0i.$EnumSwitchMapping$0[qt4.D(i11)];
                EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = u0iVar.a;
                if (i12 == 1) {
                    enhancedAnimatedVectorDrawable.onEnd();
                } else {
                    enhancedAnimatedVectorDrawable.reset();
                }
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ gba(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
