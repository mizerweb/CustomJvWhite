package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class cm1 implements e52 {
    public final /* synthetic */ CallIncomingScreen a;

    public cm1(CallIncomingScreen callIncomingScreen) {
        this.a = callIncomingScreen;
    }

    @Override // defpackage.e52
    public final void i() {
        Object value;
        Drawable drawableE;
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        ou7 ou7Var = CallIncomingScreen.m;
        CallIncomingScreen callIncomingScreen = this.a;
        msc mscVarP1 = callIncomingScreen.p1();
        svj svjVar = (svj) callIncomingScreen.i.getValue();
        wsc wscVarB = mscVarP1.b();
        String[] strArr = wsc.n;
        if (!wscVarB.c(strArr)) {
            wsc wscVarB2 = mscVarP1.b();
            wscVarB2.getClass();
            wsc.q(wscVarB2, svjVar, strArr, 183, R.string.permissions_calls_video_preview_request, R.string.permissions_video_message_request_only_camera_title, null, 32);
            return;
        }
        km1 km1VarQ1 = callIncomingScreen.q1();
        Object value2 = callIncomingScreen.q1().o.getValue();
        em1 em1Var = value2 instanceof em1 ? (em1) value2 : null;
        boolean z2 = em1Var == null ? false : em1Var.b;
        msc mscVar = km1VarQ1.h;
        Object value3 = km1VarQ1.o.getValue();
        em1 em1Var2 = value3 instanceof em1 ? (em1) value3 : null;
        if (em1Var2 == null) {
            gm0.Y(km1.class.getName(), "Early return in changeCameraState cuz of uiState.value as? CallIncomingState.Calling is null");
            return;
        }
        mjg mjgVar = km1VarQ1.n;
        do {
            value = mjgVar.getValue();
            yp9 yp9Var = yp9.b;
            boolean z3 = !z2 && mscVar.a(true) == yp9Var;
            p32 p32Var = (p32) km1VarQ1.i.getValue();
            boolean z4 = mscVar.a(z3) == yp9Var;
            Context context = p32Var.a;
            int i = z4 ? R.string.call_incoming_call_video_disable : R.string.call_incoming_call_video_enable;
            a8g a8gVar = pq3.j;
            if (z4) {
                drawableE = o7j.e(R.drawable.icon_video_call_crossed_fill, a8gVar.k(context).b.getIcon().g, context);
                drawableE.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
            } else {
                drawableE = o7j.e(R.drawable.icon_video_call_fill_mini, a8gVar.k(context).b.getIcon().g, context);
                drawableE.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
            }
            Drawable drawable = drawableE;
            z = z3;
            spannableStringBuilder = new SpannableStringBuilder(qv1.k("  ", context.getString(i)));
            spannableStringBuilder.setSpan(new FitFontImageSpan(drawable, null, false, false, 14, null), 0, 1, 17);
        } while (!mjgVar.h(value, em1.a(em1Var2, null, z, spannableStringBuilder, null, z ? dm1.VIDEO_ACCEPT : dm1.AUDIO_ACCEPT, false, null, null, 2009)));
    }
}
