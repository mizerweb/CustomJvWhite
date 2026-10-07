package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.initialization.AccountInitializer;
import one.me.rlottie.ImageReceiver;
import one.me.rlottie.RLottieDrawable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class osk {
    public static bfa a(fka fkaVar) {
        int iU;
        String strX;
        if (!fkaVar.l()) {
            return null;
        }
        try {
            iU = ch3.U(fkaVar);
        } catch (Throwable th) {
            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = fjf.a.iterator();
            while (it.hasNext()) {
                AccountInitializer accountInitializer = ((n6) it.next()).a;
                try {
                    gm0.V("Payload", "error while parse payload", th);
                    accountInitializer.d().i().g().a(null, th);
                } catch (Throwable th2) {
                    gm0.V("Payload", "failed to collect exception", th2);
                }
            }
            int iD = qt4.D(pye.a);
            if (iD != 0) {
                if (iD == 1) {
                    throw th;
                }
                ore.o();
                return null;
            }
            iU = 0;
        }
        Long lValueOf = null;
        afa afaVarA = null;
        for (int i = 0; i < iU; i++) {
            try {
                strX = ch3.X(fkaVar, null);
            } catch (Throwable th3) {
                gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = fjf.a.iterator();
                while (it2.hasNext()) {
                    AccountInitializer accountInitializer2 = ((n6) it2.next()).a;
                    try {
                        gm0.V("Payload", "error while parse payload", th3);
                        accountInitializer2.d().i().g().a(null, th3);
                    } catch (Throwable th4) {
                        gm0.V("Payload", "failed to collect exception", th4);
                    }
                }
                int iD2 = qt4.D(pye.a);
                if (iD2 != 0) {
                    if (iD2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
                strX = null;
            }
            if (strX != null) {
                try {
                    if (strX.equals("postId")) {
                        long jT = 0;
                        try {
                            jT = ch3.T(fkaVar, 0L);
                        } catch (Throwable th5) {
                            gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                            Iterator it3 = fjf.a.iterator();
                            while (it3.hasNext()) {
                                AccountInitializer accountInitializer3 = ((n6) it3.next()).a;
                                try {
                                    gm0.V("Payload", "error while parse payload", th5);
                                    accountInitializer3.d().i().g().a(null, th5);
                                } catch (Throwable th6) {
                                    gm0.V("Payload", "failed to collect exception", th6);
                                }
                            }
                            int iD3 = qt4.D(pye.a);
                            if (iD3 != 0) {
                                if (iD3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th5;
                            }
                        }
                        lValueOf = Long.valueOf(jT);
                    } else if (strX.equals("commentsInfo")) {
                        afaVarA = nsk.a(fkaVar);
                    } else {
                        fkaVar.x();
                    }
                } catch (Throwable th7) {
                    try {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                        Iterator it4 = fjf.a.iterator();
                        while (it4.hasNext()) {
                            AccountInitializer accountInitializer4 = ((n6) it4.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th7);
                                accountInitializer4.d().i().g().a(null, th7);
                            } catch (Throwable th8) {
                                gm0.V("Payload", "failed to collect exception", th8);
                            }
                        }
                        int iD4 = qt4.D(pye.a);
                        if (iD4 != 0) {
                            if (iD4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th7;
                        }
                    } catch (Throwable th9) {
                        gm0.V("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                        Iterator it5 = fjf.a.iterator();
                        while (it5.hasNext()) {
                            AccountInitializer accountInitializer5 = ((n6) it5.next()).a;
                            try {
                                gm0.V("Payload", "error while parse payload", th9);
                                accountInitializer5.d().i().g().a(null, th9);
                            } catch (Throwable th10) {
                                gm0.V("Payload", "failed to collect exception", th10);
                            }
                        }
                        int iD5 = qt4.D(pye.a);
                        if (iD5 != 0) {
                            if (iD5 == 1) {
                                throw th9;
                            }
                            ore.o();
                            return null;
                        }
                    }
                }
            }
        }
        if (lValueOf == null || afaVarA == null) {
            return null;
        }
        return new bfa(lValueOf.longValue(), afaVarA);
    }

    public static final void b(View view, Layout layout, ImageReceiver imageReceiver) {
        CharSequence text = layout.getText();
        int length = text.length();
        Object[] spans = null;
        try {
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                spans = spanned.getSpans(0, length, rn.class);
            }
        } catch (Throwable unused) {
        }
        if (spans == null) {
            spans = new rn[0];
        }
        for (Object obj : spans) {
            qn qnVar = ((rn) obj).b;
            qnVar.d(imageReceiver);
            qnVar.setCallback(view);
            qnVar.start();
        }
    }

    public static final void c(ImageView imageView, ImageReceiver imageReceiver) {
        Drawable drawable = imageView.getDrawable();
        qn qnVar = drawable instanceof qn ? (qn) drawable : null;
        if (qnVar != null) {
            qnVar.d(imageReceiver);
            qnVar.setCallback(imageView);
            qnVar.start();
        }
    }

    public static final void d(Layout layout, ImageReceiver imageReceiver) {
        Object[] spans;
        CharSequence text = layout.getText();
        int length = text.length();
        try {
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            spans = spanned != null ? spanned.getSpans(0, length, rn.class) : null;
        } catch (Throwable unused) {
        }
        if (spans == null) {
            spans = new rn[0];
        }
        for (Object obj : spans) {
            qn qnVar = ((rn) obj).b;
            qnVar.setCallback(null);
            RLottieDrawable rLottieDrawable = qnVar.o;
            if (rLottieDrawable != null) {
                rLottieDrawable.removeParentView(imageReceiver);
            }
            qnVar.r.remove(imageReceiver);
            RLottieDrawable rLottieDrawable2 = qnVar.o;
            if (rLottieDrawable2 == null || !rLottieDrawable2.hasParentViews()) {
                qnVar.stop();
            }
        }
    }

    public static final void e(ImageView imageView, ImageReceiver imageReceiver) {
        Drawable drawable = imageView.getDrawable();
        qn qnVar = drawable instanceof qn ? (qn) drawable : null;
        if (qnVar != null) {
            qnVar.setCallback(null);
            RLottieDrawable rLottieDrawable = qnVar.o;
            if (rLottieDrawable != null) {
                rLottieDrawable.removeParentView(imageReceiver);
            }
            qnVar.r.remove(imageReceiver);
            RLottieDrawable rLottieDrawable2 = qnVar.o;
            if (rLottieDrawable2 == null || !rLottieDrawable2.hasParentViews()) {
                qnVar.stop();
            }
        }
    }
}
