package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m8c {
    public static l8c b;
    public static l8c c;
    public static final Handler a = new Handler(Looper.getMainLooper(), new mn5());
    public static final AtomicBoolean d = new AtomicBoolean(false);

    public static void a(l8c l8cVar, j8c j8cVar) {
        WeakReference weakReference;
        k8c k8cVar;
        if (l8cVar == null || (weakReference = l8cVar.b) == null || (k8cVar = (k8c) weakReference.get()) == null) {
            return;
        }
        a.removeCallbacksAndMessages(k8cVar);
        k8cVar.a.b(j8cVar);
    }

    public static void b(k8c k8cVar, j8c j8cVar) {
        AtomicBoolean atomicBoolean = d;
        if (atomicBoolean.compareAndSet(false, true)) {
            atomicBoolean.set(false);
            l8c l8cVar = b;
            if (l8cVar != null ? cqk.d(l8cVar.b.get(), k8cVar) : false) {
                a(b, j8cVar);
                return;
            }
            l8c l8cVar2 = c;
            if (l8cVar2 != null ? cqk.d(l8cVar2.b.get(), k8cVar) : false) {
                a(c, j8cVar);
            }
        }
    }

    public static void c(l8c l8cVar) {
        u8c u8cVar;
        if (cqk.d(l8cVar != null ? l8cVar.a : null, q8c.b)) {
            return;
        }
        Handler handler = a;
        handler.removeCallbacksAndMessages(l8cVar);
        if (l8cVar == null || (u8cVar = l8cVar.a) == null) {
            u8cVar = s8c.b;
        }
        handler.sendMessageDelayed(Message.obtain(handler, 0, l8cVar), u8cVar.a());
    }

    public static void d() {
        k8c k8cVar;
        View view;
        l9c l9cVar;
        ViewGroup.LayoutParams layoutParams;
        l8c l8cVar = c;
        if (l8cVar != null) {
            b = l8cVar;
            View view2 = null;
            view2 = null;
            c = null;
            WeakReference weakReference = l8cVar.b;
            if (weakReference == null || (k8cVar = (k8c) weakReference.get()) == null) {
                b = null;
                return;
            }
            ll5 ll5Var = k8cVar.a;
            WeakReference weakReference2 = (WeakReference) ll5Var.c;
            reh rehVar = (reh) ll5Var.e;
            if (rehVar != null) {
                view = rehVar;
                rehVar.e();
            } else {
                if (rehVar == null) {
                    ViewGroup viewGroup = (ViewGroup) weakReference2.get();
                    Context context = viewGroup != null ? viewGroup.getContext() : null;
                    if (context != null) {
                        h9c h9cVar = (h9c) ll5Var.d;
                        ViewGroup viewGroup2 = (ViewGroup) weakReference2.get();
                        Context context2 = viewGroup2 != null ? viewGroup2.getContext() : null;
                        if (context2 == null) {
                            l9cVar = null;
                        } else {
                            l9c l9cVar2 = new l9c(context2);
                            CharSequence charSequence = h9cVar.b;
                            f9c f9cVar = h9cVar.d;
                            l9cVar2.setTitle(charSequence);
                            l9cVar2.setCaption(h9cVar.c);
                            l9cVar2.setLeftElement(h9cVar.a);
                            l9cVar2.setRightElement(f9cVar);
                            l9cVar2.setStyled(h9cVar.g);
                            if (f9cVar instanceof d9c) {
                                l9cVar2.setRightBtnAction$snackbar(null);
                            } else {
                                l9cVar2.setRightBtnAction$snackbar(new o37(26, ll5Var));
                            }
                            l9cVar = l9cVar2;
                        }
                        if (l9cVar != null) {
                            reh rehVar2 = new reh(context);
                            wfe wfeVar = new wfe();
                            ViewGroup viewGroup3 = (ViewGroup) weakReference2.get();
                            boolean z = (((h9c) ll5Var.d).e.a & 1) != 0;
                            if (viewGroup3 instanceof wf4) {
                                uf4 uf4Var = new uf4(-1, -2);
                                uf4Var.t = 0;
                                uf4Var.v = 0;
                                if (z) {
                                    uf4Var.i = 0;
                                    ((ViewGroup.MarginLayoutParams) uf4Var).topMargin = ((h9c) ll5Var.d).e.b;
                                    layoutParams = uf4Var;
                                } else {
                                    uf4Var.l = 0;
                                    ((ViewGroup.MarginLayoutParams) uf4Var).bottomMargin = ((h9c) ll5Var.d).e.c;
                                    layoutParams = uf4Var;
                                }
                            } else {
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                                o8c o8cVar = ((h9c) ll5Var.d).e;
                                layoutParams2.gravity = (o8cVar.a & 1) != 0 ? 48 : 80;
                                if (z) {
                                    layoutParams2.topMargin = o8cVar.b;
                                    layoutParams = layoutParams2;
                                } else {
                                    layoutParams2.bottomMargin = o8cVar.c;
                                    layoutParams = layoutParams2;
                                }
                            }
                            rehVar2.setLayoutParams(layoutParams);
                            WeakHashMap weakHashMap = i7j.a;
                            if (rehVar2.isAttachedToWindow()) {
                                rehVar2.requestApplyInsets();
                            } else {
                                rehVar2.addOnAttachStateChangeListener(new ga0(rehVar2, 9, rehVar2));
                            }
                            int i = uw8.a;
                            ll5Var.b = uw8.b(uw8.c);
                            y6j.l(rehVar2, new oo(ll5Var, context, rehVar2, 20));
                            rehVar2.addView(l9cVar);
                            rehVar2.setClipToPadding(false);
                            rehVar2.setClipChildren(false);
                            rehVar2.setClipToOutline(false);
                            rehVar2.setElevation(10.0f);
                            rehVar2.setCallback(new ljf(ll5Var, wfeVar, l9cVar, rehVar2, 23));
                            wfeVar.a = bdc.a(rehVar2, new v62(rehVar2, rehVar2, 1));
                            ll5Var.e = rehVar2;
                            view2 = rehVar2;
                        }
                    }
                    view = view2;
                }
                if (view != null) {
                    ViewGroup viewGroup4 = (ViewGroup) weakReference2.get();
                    if (viewGroup4 != null) {
                        viewGroup4.addView(view);
                    }
                    ViewGroup viewGroup5 = (ViewGroup) weakReference2.get();
                    if (viewGroup5 != null) {
                        viewGroup5.addOnAttachStateChangeListener((vn2) ll5Var.g);
                    }
                }
            }
            k8c k8cVar2 = (k8c) ll5Var.h;
            d.set(false);
            l8c l8cVar2 = b;
            if (l8cVar2 != null ? cqk.d(l8cVar2.b.get(), k8cVar2) : false) {
                c(b);
            }
        }
    }
}
