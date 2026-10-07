package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import ru.ok.tamtam.messages.c;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class e13 {
    public final wme A;
    public final ifh B;
    public final ifh C;
    public final ifh D;
    public final ifh E;
    public final ifh F;
    public final c13 G;
    public final String H;
    public final d13 I;
    public final ny8 a;
    public final Context b;
    public final ic1 c;
    public final af7 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ifh n;
    public final ifh o;
    public final ifh p;
    public final ifh q;
    public final ifh r;
    public final ifh s;
    public final ifh t;
    public final ifh u;
    public final ifh v;
    public final ifh w;
    public final ifh x;
    public final ifh y;
    public final ifh z;

    public e13(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, Context context, xhh xhhVar, ic1 ic1Var) {
        b6 b6Var = new b6(23);
        this.a = ny8Var10;
        this.b = context;
        this.c = ic1Var;
        this.d = b6Var;
        this.e = ny8Var2;
        this.f = ny8Var;
        this.g = ny8Var4;
        this.h = ny8Var3;
        this.i = ny8Var5;
        this.j = ny8Var6;
        this.k = ny8Var7;
        this.l = ny8Var8;
        this.m = ny8Var9;
        final int i = 11;
        this.n = new ifh(new af7(this) { // from class: v03
            public final /* synthetic */ e13 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                a8g a8gVar = pq3.j;
                e13 e13Var = this.b;
                switch (i2) {
                    case 0:
                        return new FitFontImageSpan(new umg(e13Var.b), kw6.a, false, false, 12, null);
                    case 1:
                        return new FitFontImageSpan(new et6(e13Var.b), kw6.a, false, false, 12, null);
                    case 2:
                        Context context2 = e13Var.b;
                        Drawable drawableO = wk8.o(context2, R.drawable.icon_phone_book_fill);
                        if (drawableO != null) {
                            sb8.m0(c0a.h(a8gVar, context2).d, drawableO);
                            return drawableO;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 3:
                        Context context3 = e13Var.b;
                        Drawable drawableO2 = wk8.o(context3, R.drawable.icon_file);
                        if (drawableO2 != null) {
                            sb8.m0(c0a.h(a8gVar, context3).d, drawableO2);
                            return drawableO2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 4:
                        Context context4 = e13Var.b;
                        Drawable drawableO3 = wk8.o(context4, R.drawable.icon_microphone_fill);
                        if (drawableO3 != null) {
                            sb8.m0(c0a.h(a8gVar, context4).d, drawableO3);
                            return drawableO3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 5:
                        Context context5 = e13Var.b;
                        Drawable drawableO4 = wk8.o(context5, R.drawable.icon_geolocation_fill_mini);
                        if (drawableO4 != null) {
                            sb8.m0(c0a.h(a8gVar, context5).d, drawableO4);
                            return drawableO4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 6:
                        Context context6 = e13Var.b;
                        Drawable drawableO5 = wk8.o(context6, R.drawable.icon_call_outgoing_fill);
                        if (drawableO5 != null) {
                            sb8.m0(c0a.h(a8gVar, context6).d, drawableO5);
                            return drawableO5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Context context7 = e13Var.b;
                        Drawable drawableO6 = wk8.o(context7, R.drawable.icon_video_call_outgoing_fill);
                        if (drawableO6 != null) {
                            sb8.m0(c0a.h(a8gVar, context7).d, drawableO6);
                            return drawableO6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Context context8 = e13Var.b;
                        Drawable drawableO7 = wk8.o(context8, R.drawable.icon_call_incoming_fill);
                        if (drawableO7 != null) {
                            sb8.m0(c0a.h(a8gVar, context8).d, drawableO7);
                            return drawableO7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        Context context9 = e13Var.b;
                        Drawable drawableO8 = wk8.o(context9, R.drawable.icon_video_call_incoming_fill);
                        if (drawableO8 != null) {
                            sb8.m0(c0a.h(a8gVar, context9).d, drawableO8);
                            return drawableO8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 10:
                        Context context10 = e13Var.b;
                        Drawable drawableO9 = wk8.o(context10, R.drawable.icon_call_missed_fill);
                        if (drawableO9 != null) {
                            sb8.m0(c0a.h(a8gVar, context10).d, drawableO9);
                            return drawableO9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Context context11 = e13Var.b;
                        Drawable drawableO10 = wk8.o(context11, R.drawable.icon_forward_fill);
                        if (drawableO10 != null) {
                            sb8.m0(c0a.h(a8gVar, context11).d, drawableO10);
                            return drawableO10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Context context12 = e13Var.b;
                        Drawable drawableO11 = wk8.o(context12, R.drawable.icon_video_call_missed_fill);
                        if (drawableO11 != null) {
                            sb8.m0(c0a.h(a8gVar, context12).d, drawableO11);
                            return drawableO11;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Context context13 = e13Var.b;
                        Drawable drawableO12 = wk8.o(context13, R.drawable.icon_play_fill);
                        if (drawableO12 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        a8gVar.e(context13).m();
                        sb8.m0(-1, drawableO12);
                        return drawableO12;
                    case 14:
                        Context context14 = e13Var.b;
                        Drawable drawableO13 = wk8.o(context14, R.drawable.icon_poll_fill);
                        if (drawableO13 != null) {
                            sb8.m0(c0a.h(a8gVar, context14).d, drawableO13);
                            return drawableO13;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Context context15 = e13Var.b;
                        return Build.VERSION.SDK_INT >= 33 ? context15 : ((jc9) e13Var.a.getValue()).c(context15);
                    default:
                        return new FitFontImageSpan(new qoh(e13Var.b), kw6.a, false, false, 12, null);
                }
            }
        });
        final int i2 = 2;
        this.o = new ifh(new af7(this) { // from class: v03
            public final /* synthetic */ e13 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                a8g a8gVar = pq3.j;
                e13 e13Var = this.b;
                switch (i3) {
                    case 0:
                        return new FitFontImageSpan(new umg(e13Var.b), kw6.a, false, false, 12, null);
                    case 1:
                        return new FitFontImageSpan(new et6(e13Var.b), kw6.a, false, false, 12, null);
                    case 2:
                        Context context2 = e13Var.b;
                        Drawable drawableO = wk8.o(context2, R.drawable.icon_phone_book_fill);
                        if (drawableO != null) {
                            sb8.m0(c0a.h(a8gVar, context2).d, drawableO);
                            return drawableO;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 3:
                        Context context3 = e13Var.b;
                        Drawable drawableO2 = wk8.o(context3, R.drawable.icon_file);
                        if (drawableO2 != null) {
                            sb8.m0(c0a.h(a8gVar, context3).d, drawableO2);
                            return drawableO2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 4:
                        Context context4 = e13Var.b;
                        Drawable drawableO3 = wk8.o(context4, R.drawable.icon_microphone_fill);
                        if (drawableO3 != null) {
                            sb8.m0(c0a.h(a8gVar, context4).d, drawableO3);
                            return drawableO3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 5:
                        Context context5 = e13Var.b;
                        Drawable drawableO4 = wk8.o(context5, R.drawable.icon_geolocation_fill_mini);
                        if (drawableO4 != null) {
                            sb8.m0(c0a.h(a8gVar, context5).d, drawableO4);
                            return drawableO4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 6:
                        Context context6 = e13Var.b;
                        Drawable drawableO5 = wk8.o(context6, R.drawable.icon_call_outgoing_fill);
                        if (drawableO5 != null) {
                            sb8.m0(c0a.h(a8gVar, context6).d, drawableO5);
                            return drawableO5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Context context7 = e13Var.b;
                        Drawable drawableO6 = wk8.o(context7, R.drawable.icon_video_call_outgoing_fill);
                        if (drawableO6 != null) {
                            sb8.m0(c0a.h(a8gVar, context7).d, drawableO6);
                            return drawableO6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Context context8 = e13Var.b;
                        Drawable drawableO7 = wk8.o(context8, R.drawable.icon_call_incoming_fill);
                        if (drawableO7 != null) {
                            sb8.m0(c0a.h(a8gVar, context8).d, drawableO7);
                            return drawableO7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        Context context9 = e13Var.b;
                        Drawable drawableO8 = wk8.o(context9, R.drawable.icon_video_call_incoming_fill);
                        if (drawableO8 != null) {
                            sb8.m0(c0a.h(a8gVar, context9).d, drawableO8);
                            return drawableO8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 10:
                        Context context10 = e13Var.b;
                        Drawable drawableO9 = wk8.o(context10, R.drawable.icon_call_missed_fill);
                        if (drawableO9 != null) {
                            sb8.m0(c0a.h(a8gVar, context10).d, drawableO9);
                            return drawableO9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Context context11 = e13Var.b;
                        Drawable drawableO10 = wk8.o(context11, R.drawable.icon_forward_fill);
                        if (drawableO10 != null) {
                            sb8.m0(c0a.h(a8gVar, context11).d, drawableO10);
                            return drawableO10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Context context12 = e13Var.b;
                        Drawable drawableO11 = wk8.o(context12, R.drawable.icon_video_call_missed_fill);
                        if (drawableO11 != null) {
                            sb8.m0(c0a.h(a8gVar, context12).d, drawableO11);
                            return drawableO11;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Context context13 = e13Var.b;
                        Drawable drawableO12 = wk8.o(context13, R.drawable.icon_play_fill);
                        if (drawableO12 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        a8gVar.e(context13).m();
                        sb8.m0(-1, drawableO12);
                        return drawableO12;
                    case 14:
                        Context context14 = e13Var.b;
                        Drawable drawableO13 = wk8.o(context14, R.drawable.icon_poll_fill);
                        if (drawableO13 != null) {
                            sb8.m0(c0a.h(a8gVar, context14).d, drawableO13);
                            return drawableO13;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Context context15 = e13Var.b;
                        return Build.VERSION.SDK_INT >= 33 ? context15 : ((jc9) e13Var.a.getValue()).c(context15);
                    default:
                        return new FitFontImageSpan(new qoh(e13Var.b), kw6.a, false, false, 12, null);
                }
            }
        });
        final int i3 = 3;
        this.p = new ifh(new af7(this) { // from class: v03
            public final /* synthetic */ e13 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                a8g a8gVar = pq3.j;
                e13 e13Var = this.b;
                switch (i4) {
                    case 0:
                        return new FitFontImageSpan(new umg(e13Var.b), kw6.a, false, false, 12, null);
                    case 1:
                        return new FitFontImageSpan(new et6(e13Var.b), kw6.a, false, false, 12, null);
                    case 2:
                        Context context2 = e13Var.b;
                        Drawable drawableO = wk8.o(context2, R.drawable.icon_phone_book_fill);
                        if (drawableO != null) {
                            sb8.m0(c0a.h(a8gVar, context2).d, drawableO);
                            return drawableO;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 3:
                        Context context3 = e13Var.b;
                        Drawable drawableO2 = wk8.o(context3, R.drawable.icon_file);
                        if (drawableO2 != null) {
                            sb8.m0(c0a.h(a8gVar, context3).d, drawableO2);
                            return drawableO2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 4:
                        Context context4 = e13Var.b;
                        Drawable drawableO3 = wk8.o(context4, R.drawable.icon_microphone_fill);
                        if (drawableO3 != null) {
                            sb8.m0(c0a.h(a8gVar, context4).d, drawableO3);
                            return drawableO3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 5:
                        Context context5 = e13Var.b;
                        Drawable drawableO4 = wk8.o(context5, R.drawable.icon_geolocation_fill_mini);
                        if (drawableO4 != null) {
                            sb8.m0(c0a.h(a8gVar, context5).d, drawableO4);
                            return drawableO4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 6:
                        Context context6 = e13Var.b;
                        Drawable drawableO5 = wk8.o(context6, R.drawable.icon_call_outgoing_fill);
                        if (drawableO5 != null) {
                            sb8.m0(c0a.h(a8gVar, context6).d, drawableO5);
                            return drawableO5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Context context7 = e13Var.b;
                        Drawable drawableO6 = wk8.o(context7, R.drawable.icon_video_call_outgoing_fill);
                        if (drawableO6 != null) {
                            sb8.m0(c0a.h(a8gVar, context7).d, drawableO6);
                            return drawableO6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Context context8 = e13Var.b;
                        Drawable drawableO7 = wk8.o(context8, R.drawable.icon_call_incoming_fill);
                        if (drawableO7 != null) {
                            sb8.m0(c0a.h(a8gVar, context8).d, drawableO7);
                            return drawableO7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        Context context9 = e13Var.b;
                        Drawable drawableO8 = wk8.o(context9, R.drawable.icon_video_call_incoming_fill);
                        if (drawableO8 != null) {
                            sb8.m0(c0a.h(a8gVar, context9).d, drawableO8);
                            return drawableO8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 10:
                        Context context10 = e13Var.b;
                        Drawable drawableO9 = wk8.o(context10, R.drawable.icon_call_missed_fill);
                        if (drawableO9 != null) {
                            sb8.m0(c0a.h(a8gVar, context10).d, drawableO9);
                            return drawableO9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Context context11 = e13Var.b;
                        Drawable drawableO10 = wk8.o(context11, R.drawable.icon_forward_fill);
                        if (drawableO10 != null) {
                            sb8.m0(c0a.h(a8gVar, context11).d, drawableO10);
                            return drawableO10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Context context12 = e13Var.b;
                        Drawable drawableO11 = wk8.o(context12, R.drawable.icon_video_call_missed_fill);
                        if (drawableO11 != null) {
                            sb8.m0(c0a.h(a8gVar, context12).d, drawableO11);
                            return drawableO11;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Context context13 = e13Var.b;
                        Drawable drawableO12 = wk8.o(context13, R.drawable.icon_play_fill);
                        if (drawableO12 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        a8gVar.e(context13).m();
                        sb8.m0(-1, drawableO12);
                        return drawableO12;
                    case 14:
                        Context context14 = e13Var.b;
                        Drawable drawableO13 = wk8.o(context14, R.drawable.icon_poll_fill);
                        if (drawableO13 != null) {
                            sb8.m0(c0a.h(a8gVar, context14).d, drawableO13);
                            return drawableO13;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Context context15 = e13Var.b;
                        return Build.VERSION.SDK_INT >= 33 ? context15 : ((jc9) e13Var.a.getValue()).c(context15);
                    default:
                        return new FitFontImageSpan(new qoh(e13Var.b), kw6.a, false, false, 12, null);
                }
            }
        });
        final int i4 = 4;
        this.q = new ifh(new af7(this) { // from class: v03
            public final /* synthetic */ e13 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i4;
                a8g a8gVar = pq3.j;
                e13 e13Var = this.b;
                switch (i5) {
                    case 0:
                        return new FitFontImageSpan(new umg(e13Var.b), kw6.a, false, false, 12, null);
                    case 1:
                        return new FitFontImageSpan(new et6(e13Var.b), kw6.a, false, false, 12, null);
                    case 2:
                        Context context2 = e13Var.b;
                        Drawable drawableO = wk8.o(context2, R.drawable.icon_phone_book_fill);
                        if (drawableO != null) {
                            sb8.m0(c0a.h(a8gVar, context2).d, drawableO);
                            return drawableO;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 3:
                        Context context3 = e13Var.b;
                        Drawable drawableO2 = wk8.o(context3, R.drawable.icon_file);
                        if (drawableO2 != null) {
                            sb8.m0(c0a.h(a8gVar, context3).d, drawableO2);
                            return drawableO2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 4:
                        Context context4 = e13Var.b;
                        Drawable drawableO3 = wk8.o(context4, R.drawable.icon_microphone_fill);
                        if (drawableO3 != null) {
                            sb8.m0(c0a.h(a8gVar, context4).d, drawableO3);
                            return drawableO3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 5:
                        Context context5 = e13Var.b;
                        Drawable drawableO4 = wk8.o(context5, R.drawable.icon_geolocation_fill_mini);
                        if (drawableO4 != null) {
                            sb8.m0(c0a.h(a8gVar, context5).d, drawableO4);
                            return drawableO4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 6:
                        Context context6 = e13Var.b;
                        Drawable drawableO5 = wk8.o(context6, R.drawable.icon_call_outgoing_fill);
                        if (drawableO5 != null) {
                            sb8.m0(c0a.h(a8gVar, context6).d, drawableO5);
                            return drawableO5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Context context7 = e13Var.b;
                        Drawable drawableO6 = wk8.o(context7, R.drawable.icon_video_call_outgoing_fill);
                        if (drawableO6 != null) {
                            sb8.m0(c0a.h(a8gVar, context7).d, drawableO6);
                            return drawableO6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Context context8 = e13Var.b;
                        Drawable drawableO7 = wk8.o(context8, R.drawable.icon_call_incoming_fill);
                        if (drawableO7 != null) {
                            sb8.m0(c0a.h(a8gVar, context8).d, drawableO7);
                            return drawableO7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        Context context9 = e13Var.b;
                        Drawable drawableO8 = wk8.o(context9, R.drawable.icon_video_call_incoming_fill);
                        if (drawableO8 != null) {
                            sb8.m0(c0a.h(a8gVar, context9).d, drawableO8);
                            return drawableO8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 10:
                        Context context10 = e13Var.b;
                        Drawable drawableO9 = wk8.o(context10, R.drawable.icon_call_missed_fill);
                        if (drawableO9 != null) {
                            sb8.m0(c0a.h(a8gVar, context10).d, drawableO9);
                            return drawableO9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Context context11 = e13Var.b;
                        Drawable drawableO10 = wk8.o(context11, R.drawable.icon_forward_fill);
                        if (drawableO10 != null) {
                            sb8.m0(c0a.h(a8gVar, context11).d, drawableO10);
                            return drawableO10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Context context12 = e13Var.b;
                        Drawable drawableO11 = wk8.o(context12, R.drawable.icon_video_call_missed_fill);
                        if (drawableO11 != null) {
                            sb8.m0(c0a.h(a8gVar, context12).d, drawableO11);
                            return drawableO11;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Context context13 = e13Var.b;
                        Drawable drawableO12 = wk8.o(context13, R.drawable.icon_play_fill);
                        if (drawableO12 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        a8gVar.e(context13).m();
                        sb8.m0(-1, drawableO12);
                        return drawableO12;
                    case 14:
                        Context context14 = e13Var.b;
                        Drawable drawableO13 = wk8.o(context14, R.drawable.icon_poll_fill);
                        if (drawableO13 != null) {
                            sb8.m0(c0a.h(a8gVar, context14).d, drawableO13);
                            return drawableO13;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Context context15 = e13Var.b;
                        return Build.VERSION.SDK_INT >= 33 ? context15 : ((jc9) e13Var.a.getValue()).c(context15);
                    default:
                        return new FitFontImageSpan(new qoh(e13Var.b), kw6.a, false, false, 12, null);
                }
            }
        });
        final int i5 = 5;
        this.r = new ifh(new af7(this) { // from class: v03
            public final /* synthetic */ e13 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i6 = i5;
                a8g a8gVar = pq3.j;
                e13 e13Var = this.b;
                switch (i6) {
                    case 0:
                        return new FitFontImageSpan(new umg(e13Var.b), kw6.a, false, false, 12, null);
                    case 1:
                        return new FitFontImageSpan(new et6(e13Var.b), kw6.a, false, false, 12, null);
                    case 2:
                        Context context2 = e13Var.b;
                        Drawable drawableO = wk8.o(context2, R.drawable.icon_phone_book_fill);
                        if (drawableO != null) {
                            sb8.m0(c0a.h(a8gVar, context2).d, drawableO);
                            return drawableO;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 3:
                        Context context3 = e13Var.b;
                        Drawable drawableO2 = wk8.o(context3, R.drawable.icon_file);
                        if (drawableO2 != null) {
                            sb8.m0(c0a.h(a8gVar, context3).d, drawableO2);
                            return drawableO2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 4:
                        Context context4 = e13Var.b;
                        Drawable drawableO3 = wk8.o(context4, R.drawable.icon_microphone_fill);
                        if (drawableO3 != null) {
                            sb8.m0(c0a.h(a8gVar, context4).d, drawableO3);
                            return drawableO3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 5:
                        Context context5 = e13Var.b;
                        Drawable drawableO4 = wk8.o(context5, R.drawable.icon_geolocation_fill_mini);
                        if (drawableO4 != null) {
                            sb8.m0(c0a.h(a8gVar, context5).d, drawableO4);
                            return drawableO4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 6:
                        Context context6 = e13Var.b;
                        Drawable drawableO5 = wk8.o(context6, R.drawable.icon_call_outgoing_fill);
                        if (drawableO5 != null) {
                            sb8.m0(c0a.h(a8gVar, context6).d, drawableO5);
                            return drawableO5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Context context7 = e13Var.b;
                        Drawable drawableO6 = wk8.o(context7, R.drawable.icon_video_call_outgoing_fill);
                        if (drawableO6 != null) {
                            sb8.m0(c0a.h(a8gVar, context7).d, drawableO6);
                            return drawableO6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Context context8 = e13Var.b;
                        Drawable drawableO7 = wk8.o(context8, R.drawable.icon_call_incoming_fill);
                        if (drawableO7 != null) {
                            sb8.m0(c0a.h(a8gVar, context8).d, drawableO7);
                            return drawableO7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        Context context9 = e13Var.b;
                        Drawable drawableO8 = wk8.o(context9, R.drawable.icon_video_call_incoming_fill);
                        if (drawableO8 != null) {
                            sb8.m0(c0a.h(a8gVar, context9).d, drawableO8);
                            return drawableO8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 10:
                        Context context10 = e13Var.b;
                        Drawable drawableO9 = wk8.o(context10, R.drawable.icon_call_missed_fill);
                        if (drawableO9 != null) {
                            sb8.m0(c0a.h(a8gVar, context10).d, drawableO9);
                            return drawableO9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Context context11 = e13Var.b;
                        Drawable drawableO10 = wk8.o(context11, R.drawable.icon_forward_fill);
                        if (drawableO10 != null) {
                            sb8.m0(c0a.h(a8gVar, context11).d, drawableO10);
                            return drawableO10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Context context12 = e13Var.b;
                        Drawable drawableO11 = wk8.o(context12, R.drawable.icon_video_call_missed_fill);
                        if (drawableO11 != null) {
                            sb8.m0(c0a.h(a8gVar, context12).d, drawableO11);
                            return drawableO11;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Context context13 = e13Var.b;
                        Drawable drawableO12 = wk8.o(context13, R.drawable.icon_play_fill);
                        if (drawableO12 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        a8gVar.e(context13).m();
                        sb8.m0(-1, drawableO12);
                        return drawableO12;
                    case 14:
                        Context context14 = e13Var.b;
                        Drawable drawableO13 = wk8.o(context14, R.drawable.icon_poll_fill);
                        if (drawableO13 != null) {
                            sb8.m0(c0a.h(a8gVar, context14).d, drawableO13);
                            return drawableO13;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Context context15 = e13Var.b;
                        return Build.VERSION.SDK_INT >= 33 ? context15 : ((jc9) e13Var.a.getValue()).c(context15);
                    default:
                        return new FitFontImageSpan(new qoh(e13Var.b), kw6.a, false, false, 12, null);
                }
            }
        });
        final int i6 = 6;
        this.s = new ifh(new af7(this) { // from class: v03
            public final /* synthetic */ e13 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i7 = i6;
                a8g a8gVar = pq3.j;
                e13 e13Var = this.b;
                switch (i7) {
                    case 0:
                        return new FitFontImageSpan(new umg(e13Var.b), kw6.a, false, false, 12, null);
                    case 1:
                        return new FitFontImageSpan(new et6(e13Var.b), kw6.a, false, false, 12, null);
                    case 2:
                        Context context2 = e13Var.b;
                        Drawable drawableO = wk8.o(context2, R.drawable.icon_phone_book_fill);
                        if (drawableO != null) {
                            sb8.m0(c0a.h(a8gVar, context2).d, drawableO);
                            return drawableO;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 3:
                        Context context3 = e13Var.b;
                        Drawable drawableO2 = wk8.o(context3, R.drawable.icon_file);
                        if (drawableO2 != null) {
                            sb8.m0(c0a.h(a8gVar, context3).d, drawableO2);
                            return drawableO2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 4:
                        Context context4 = e13Var.b;
                        Drawable drawableO3 = wk8.o(context4, R.drawable.icon_microphone_fill);
                        if (drawableO3 != null) {
                            sb8.m0(c0a.h(a8gVar, context4).d, drawableO3);
                            return drawableO3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 5:
                        Context context5 = e13Var.b;
                        Drawable drawableO4 = wk8.o(context5, R.drawable.icon_geolocation_fill_mini);
                        if (drawableO4 != null) {
                            sb8.m0(c0a.h(a8gVar, context5).d, drawableO4);
                            return drawableO4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 6:
                        Context context6 = e13Var.b;
                        Drawable drawableO5 = wk8.o(context6, R.drawable.icon_call_outgoing_fill);
                        if (drawableO5 != null) {
                            sb8.m0(c0a.h(a8gVar, context6).d, drawableO5);
                            return drawableO5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Context context7 = e13Var.b;
                        Drawable drawableO6 = wk8.o(context7, R.drawable.icon_video_call_outgoing_fill);
                        if (drawableO6 != null) {
                            sb8.m0(c0a.h(a8gVar, context7).d, drawableO6);
                            return drawableO6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Context context8 = e13Var.b;
                        Drawable drawableO7 = wk8.o(context8, R.drawable.icon_call_incoming_fill);
                        if (drawableO7 != null) {
                            sb8.m0(c0a.h(a8gVar, context8).d, drawableO7);
                            return drawableO7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        Context context9 = e13Var.b;
                        Drawable drawableO8 = wk8.o(context9, R.drawable.icon_video_call_incoming_fill);
                        if (drawableO8 != null) {
                            sb8.m0(c0a.h(a8gVar, context9).d, drawableO8);
                            return drawableO8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 10:
                        Context context10 = e13Var.b;
                        Drawable drawableO9 = wk8.o(context10, R.drawable.icon_call_missed_fill);
                        if (drawableO9 != null) {
                            sb8.m0(c0a.h(a8gVar, context10).d, drawableO9);
                            return drawableO9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Context context11 = e13Var.b;
                        Drawable drawableO10 = wk8.o(context11, R.drawable.icon_forward_fill);
                        if (drawableO10 != null) {
                            sb8.m0(c0a.h(a8gVar, context11).d, drawableO10);
                            return drawableO10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Context context12 = e13Var.b;
                        Drawable drawableO11 = wk8.o(context12, R.drawable.icon_video_call_missed_fill);
                        if (drawableO11 != null) {
                            sb8.m0(c0a.h(a8gVar, context12).d, drawableO11);
                            return drawableO11;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Context context13 = e13Var.b;
                        Drawable drawableO12 = wk8.o(context13, R.drawable.icon_play_fill);
                        if (drawableO12 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        a8gVar.e(context13).m();
                        sb8.m0(-1, drawableO12);
                        return drawableO12;
                    case 14:
                        Context context14 = e13Var.b;
                        Drawable drawableO13 = wk8.o(context14, R.drawable.icon_poll_fill);
                        if (drawableO13 != null) {
                            sb8.m0(c0a.h(a8gVar, context14).d, drawableO13);
                            return drawableO13;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Context context15 = e13Var.b;
                        return Build.VERSION.SDK_INT >= 33 ? context15 : ((jc9) e13Var.a.getValue()).c(context15);
                    default:
                        return new FitFontImageSpan(new qoh(e13Var.b), kw6.a, false, false, 12, null);
                }
            }
        });
        final int i7 = 7;
        this.t = new ifh(new af7(this) { // from class: v03
            public final /* synthetic */ e13 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i8 = i7;
                a8g a8gVar = pq3.j;
                e13 e13Var = this.b;
                switch (i8) {
                    case 0:
                        return new FitFontImageSpan(new umg(e13Var.b), kw6.a, false, false, 12, null);
                    case 1:
                        return new FitFontImageSpan(new et6(e13Var.b), kw6.a, false, false, 12, null);
                    case 2:
                        Context context2 = e13Var.b;
                        Drawable drawableO = wk8.o(context2, R.drawable.icon_phone_book_fill);
                        if (drawableO != null) {
                            sb8.m0(c0a.h(a8gVar, context2).d, drawableO);
                            return drawableO;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 3:
                        Context context3 = e13Var.b;
                        Drawable drawableO2 = wk8.o(context3, R.drawable.icon_file);
                        if (drawableO2 != null) {
                            sb8.m0(c0a.h(a8gVar, context3).d, drawableO2);
                            return drawableO2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 4:
                        Context context4 = e13Var.b;
                        Drawable drawableO3 = wk8.o(context4, R.drawable.icon_microphone_fill);
                        if (drawableO3 != null) {
                            sb8.m0(c0a.h(a8gVar, context4).d, drawableO3);
                            return drawableO3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 5:
                        Context context5 = e13Var.b;
                        Drawable drawableO4 = wk8.o(context5, R.drawable.icon_geolocation_fill_mini);
                        if (drawableO4 != null) {
                            sb8.m0(c0a.h(a8gVar, context5).d, drawableO4);
                            return drawableO4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 6:
                        Context context6 = e13Var.b;
                        Drawable drawableO5 = wk8.o(context6, R.drawable.icon_call_outgoing_fill);
                        if (drawableO5 != null) {
                            sb8.m0(c0a.h(a8gVar, context6).d, drawableO5);
                            return drawableO5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Context context7 = e13Var.b;
                        Drawable drawableO6 = wk8.o(context7, R.drawable.icon_video_call_outgoing_fill);
                        if (drawableO6 != null) {
                            sb8.m0(c0a.h(a8gVar, context7).d, drawableO6);
                            return drawableO6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Context context8 = e13Var.b;
                        Drawable drawableO7 = wk8.o(context8, R.drawable.icon_call_incoming_fill);
                        if (drawableO7 != null) {
                            sb8.m0(c0a.h(a8gVar, context8).d, drawableO7);
                            return drawableO7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        Context context9 = e13Var.b;
                        Drawable drawableO8 = wk8.o(context9, R.drawable.icon_video_call_incoming_fill);
                        if (drawableO8 != null) {
                            sb8.m0(c0a.h(a8gVar, context9).d, drawableO8);
                            return drawableO8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 10:
                        Context context10 = e13Var.b;
                        Drawable drawableO9 = wk8.o(context10, R.drawable.icon_call_missed_fill);
                        if (drawableO9 != null) {
                            sb8.m0(c0a.h(a8gVar, context10).d, drawableO9);
                            return drawableO9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Context context11 = e13Var.b;
                        Drawable drawableO10 = wk8.o(context11, R.drawable.icon_forward_fill);
                        if (drawableO10 != null) {
                            sb8.m0(c0a.h(a8gVar, context11).d, drawableO10);
                            return drawableO10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Context context12 = e13Var.b;
                        Drawable drawableO11 = wk8.o(context12, R.drawable.icon_video_call_missed_fill);
                        if (drawableO11 != null) {
                            sb8.m0(c0a.h(a8gVar, context12).d, drawableO11);
                            return drawableO11;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Context context13 = e13Var.b;
                        Drawable drawableO12 = wk8.o(context13, R.drawable.icon_play_fill);
                        if (drawableO12 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        a8gVar.e(context13).m();
                        sb8.m0(-1, drawableO12);
                        return drawableO12;
                    case 14:
                        Context context14 = e13Var.b;
                        Drawable drawableO13 = wk8.o(context14, R.drawable.icon_poll_fill);
                        if (drawableO13 != null) {
                            sb8.m0(c0a.h(a8gVar, context14).d, drawableO13);
                            return drawableO13;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Context context15 = e13Var.b;
                        return Build.VERSION.SDK_INT >= 33 ? context15 : ((jc9) e13Var.a.getValue()).c(context15);
                    default:
                        return new FitFontImageSpan(new qoh(e13Var.b), kw6.a, false, false, 12, null);
                }
            }
        });
        final int i8 = 8;
        this.u = new ifh(new af7(this) { // from class: v03
            public final /* synthetic */ e13 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i9 = i8;
                a8g a8gVar = pq3.j;
                e13 e13Var = this.b;
                switch (i9) {
                    case 0:
                        return new FitFontImageSpan(new umg(e13Var.b), kw6.a, false, false, 12, null);
                    case 1:
                        return new FitFontImageSpan(new et6(e13Var.b), kw6.a, false, false, 12, null);
                    case 2:
                        Context context2 = e13Var.b;
                        Drawable drawableO = wk8.o(context2, R.drawable.icon_phone_book_fill);
                        if (drawableO != null) {
                            sb8.m0(c0a.h(a8gVar, context2).d, drawableO);
                            return drawableO;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 3:
                        Context context3 = e13Var.b;
                        Drawable drawableO2 = wk8.o(context3, R.drawable.icon_file);
                        if (drawableO2 != null) {
                            sb8.m0(c0a.h(a8gVar, context3).d, drawableO2);
                            return drawableO2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 4:
                        Context context4 = e13Var.b;
                        Drawable drawableO3 = wk8.o(context4, R.drawable.icon_microphone_fill);
                        if (drawableO3 != null) {
                            sb8.m0(c0a.h(a8gVar, context4).d, drawableO3);
                            return drawableO3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 5:
                        Context context5 = e13Var.b;
                        Drawable drawableO4 = wk8.o(context5, R.drawable.icon_geolocation_fill_mini);
                        if (drawableO4 != null) {
                            sb8.m0(c0a.h(a8gVar, context5).d, drawableO4);
                            return drawableO4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 6:
                        Context context6 = e13Var.b;
                        Drawable drawableO5 = wk8.o(context6, R.drawable.icon_call_outgoing_fill);
                        if (drawableO5 != null) {
                            sb8.m0(c0a.h(a8gVar, context6).d, drawableO5);
                            return drawableO5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Context context7 = e13Var.b;
                        Drawable drawableO6 = wk8.o(context7, R.drawable.icon_video_call_outgoing_fill);
                        if (drawableO6 != null) {
                            sb8.m0(c0a.h(a8gVar, context7).d, drawableO6);
                            return drawableO6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Context context8 = e13Var.b;
                        Drawable drawableO7 = wk8.o(context8, R.drawable.icon_call_incoming_fill);
                        if (drawableO7 != null) {
                            sb8.m0(c0a.h(a8gVar, context8).d, drawableO7);
                            return drawableO7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        Context context9 = e13Var.b;
                        Drawable drawableO8 = wk8.o(context9, R.drawable.icon_video_call_incoming_fill);
                        if (drawableO8 != null) {
                            sb8.m0(c0a.h(a8gVar, context9).d, drawableO8);
                            return drawableO8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 10:
                        Context context10 = e13Var.b;
                        Drawable drawableO9 = wk8.o(context10, R.drawable.icon_call_missed_fill);
                        if (drawableO9 != null) {
                            sb8.m0(c0a.h(a8gVar, context10).d, drawableO9);
                            return drawableO9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Context context11 = e13Var.b;
                        Drawable drawableO10 = wk8.o(context11, R.drawable.icon_forward_fill);
                        if (drawableO10 != null) {
                            sb8.m0(c0a.h(a8gVar, context11).d, drawableO10);
                            return drawableO10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Context context12 = e13Var.b;
                        Drawable drawableO11 = wk8.o(context12, R.drawable.icon_video_call_missed_fill);
                        if (drawableO11 != null) {
                            sb8.m0(c0a.h(a8gVar, context12).d, drawableO11);
                            return drawableO11;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Context context13 = e13Var.b;
                        Drawable drawableO12 = wk8.o(context13, R.drawable.icon_play_fill);
                        if (drawableO12 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        a8gVar.e(context13).m();
                        sb8.m0(-1, drawableO12);
                        return drawableO12;
                    case 14:
                        Context context14 = e13Var.b;
                        Drawable drawableO13 = wk8.o(context14, R.drawable.icon_poll_fill);
                        if (drawableO13 != null) {
                            sb8.m0(c0a.h(a8gVar, context14).d, drawableO13);
                            return drawableO13;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Context context15 = e13Var.b;
                        return Build.VERSION.SDK_INT >= 33 ? context15 : ((jc9) e13Var.a.getValue()).c(context15);
                    default:
                        return new FitFontImageSpan(new qoh(e13Var.b), kw6.a, false, false, 12, null);
                }
            }
        });
        final int i9 = 9;
        this.v = new ifh(new af7(this) { // from class: v03
            public final /* synthetic */ e13 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i10 = i9;
                a8g a8gVar = pq3.j;
                e13 e13Var = this.b;
                switch (i10) {
                    case 0:
                        return new FitFontImageSpan(new umg(e13Var.b), kw6.a, false, false, 12, null);
                    case 1:
                        return new FitFontImageSpan(new et6(e13Var.b), kw6.a, false, false, 12, null);
                    case 2:
                        Context context2 = e13Var.b;
                        Drawable drawableO = wk8.o(context2, R.drawable.icon_phone_book_fill);
                        if (drawableO != null) {
                            sb8.m0(c0a.h(a8gVar, context2).d, drawableO);
                            return drawableO;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 3:
                        Context context3 = e13Var.b;
                        Drawable drawableO2 = wk8.o(context3, R.drawable.icon_file);
                        if (drawableO2 != null) {
                            sb8.m0(c0a.h(a8gVar, context3).d, drawableO2);
                            return drawableO2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 4:
                        Context context4 = e13Var.b;
                        Drawable drawableO3 = wk8.o(context4, R.drawable.icon_microphone_fill);
                        if (drawableO3 != null) {
                            sb8.m0(c0a.h(a8gVar, context4).d, drawableO3);
                            return drawableO3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 5:
                        Context context5 = e13Var.b;
                        Drawable drawableO4 = wk8.o(context5, R.drawable.icon_geolocation_fill_mini);
                        if (drawableO4 != null) {
                            sb8.m0(c0a.h(a8gVar, context5).d, drawableO4);
                            return drawableO4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 6:
                        Context context6 = e13Var.b;
                        Drawable drawableO5 = wk8.o(context6, R.drawable.icon_call_outgoing_fill);
                        if (drawableO5 != null) {
                            sb8.m0(c0a.h(a8gVar, context6).d, drawableO5);
                            return drawableO5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Context context7 = e13Var.b;
                        Drawable drawableO6 = wk8.o(context7, R.drawable.icon_video_call_outgoing_fill);
                        if (drawableO6 != null) {
                            sb8.m0(c0a.h(a8gVar, context7).d, drawableO6);
                            return drawableO6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Context context8 = e13Var.b;
                        Drawable drawableO7 = wk8.o(context8, R.drawable.icon_call_incoming_fill);
                        if (drawableO7 != null) {
                            sb8.m0(c0a.h(a8gVar, context8).d, drawableO7);
                            return drawableO7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        Context context9 = e13Var.b;
                        Drawable drawableO8 = wk8.o(context9, R.drawable.icon_video_call_incoming_fill);
                        if (drawableO8 != null) {
                            sb8.m0(c0a.h(a8gVar, context9).d, drawableO8);
                            return drawableO8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 10:
                        Context context10 = e13Var.b;
                        Drawable drawableO9 = wk8.o(context10, R.drawable.icon_call_missed_fill);
                        if (drawableO9 != null) {
                            sb8.m0(c0a.h(a8gVar, context10).d, drawableO9);
                            return drawableO9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Context context11 = e13Var.b;
                        Drawable drawableO10 = wk8.o(context11, R.drawable.icon_forward_fill);
                        if (drawableO10 != null) {
                            sb8.m0(c0a.h(a8gVar, context11).d, drawableO10);
                            return drawableO10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Context context12 = e13Var.b;
                        Drawable drawableO11 = wk8.o(context12, R.drawable.icon_video_call_missed_fill);
                        if (drawableO11 != null) {
                            sb8.m0(c0a.h(a8gVar, context12).d, drawableO11);
                            return drawableO11;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Context context13 = e13Var.b;
                        Drawable drawableO12 = wk8.o(context13, R.drawable.icon_play_fill);
                        if (drawableO12 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        a8gVar.e(context13).m();
                        sb8.m0(-1, drawableO12);
                        return drawableO12;
                    case 14:
                        Context context14 = e13Var.b;
                        Drawable drawableO13 = wk8.o(context14, R.drawable.icon_poll_fill);
                        if (drawableO13 != null) {
                            sb8.m0(c0a.h(a8gVar, context14).d, drawableO13);
                            return drawableO13;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Context context15 = e13Var.b;
                        return Build.VERSION.SDK_INT >= 33 ? context15 : ((jc9) e13Var.a.getValue()).c(context15);
                    default:
                        return new FitFontImageSpan(new qoh(e13Var.b), kw6.a, false, false, 12, null);
                }
            }
        });
        final int i10 = 10;
        this.w = new ifh(new af7(this) { // from class: v03
            public final /* synthetic */ e13 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i11 = i10;
                a8g a8gVar = pq3.j;
                e13 e13Var = this.b;
                switch (i11) {
                    case 0:
                        return new FitFontImageSpan(new umg(e13Var.b), kw6.a, false, false, 12, null);
                    case 1:
                        return new FitFontImageSpan(new et6(e13Var.b), kw6.a, false, false, 12, null);
                    case 2:
                        Context context2 = e13Var.b;
                        Drawable drawableO = wk8.o(context2, R.drawable.icon_phone_book_fill);
                        if (drawableO != null) {
                            sb8.m0(c0a.h(a8gVar, context2).d, drawableO);
                            return drawableO;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 3:
                        Context context3 = e13Var.b;
                        Drawable drawableO2 = wk8.o(context3, R.drawable.icon_file);
                        if (drawableO2 != null) {
                            sb8.m0(c0a.h(a8gVar, context3).d, drawableO2);
                            return drawableO2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 4:
                        Context context4 = e13Var.b;
                        Drawable drawableO3 = wk8.o(context4, R.drawable.icon_microphone_fill);
                        if (drawableO3 != null) {
                            sb8.m0(c0a.h(a8gVar, context4).d, drawableO3);
                            return drawableO3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 5:
                        Context context5 = e13Var.b;
                        Drawable drawableO4 = wk8.o(context5, R.drawable.icon_geolocation_fill_mini);
                        if (drawableO4 != null) {
                            sb8.m0(c0a.h(a8gVar, context5).d, drawableO4);
                            return drawableO4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 6:
                        Context context6 = e13Var.b;
                        Drawable drawableO5 = wk8.o(context6, R.drawable.icon_call_outgoing_fill);
                        if (drawableO5 != null) {
                            sb8.m0(c0a.h(a8gVar, context6).d, drawableO5);
                            return drawableO5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Context context7 = e13Var.b;
                        Drawable drawableO6 = wk8.o(context7, R.drawable.icon_video_call_outgoing_fill);
                        if (drawableO6 != null) {
                            sb8.m0(c0a.h(a8gVar, context7).d, drawableO6);
                            return drawableO6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Context context8 = e13Var.b;
                        Drawable drawableO7 = wk8.o(context8, R.drawable.icon_call_incoming_fill);
                        if (drawableO7 != null) {
                            sb8.m0(c0a.h(a8gVar, context8).d, drawableO7);
                            return drawableO7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        Context context9 = e13Var.b;
                        Drawable drawableO8 = wk8.o(context9, R.drawable.icon_video_call_incoming_fill);
                        if (drawableO8 != null) {
                            sb8.m0(c0a.h(a8gVar, context9).d, drawableO8);
                            return drawableO8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 10:
                        Context context10 = e13Var.b;
                        Drawable drawableO9 = wk8.o(context10, R.drawable.icon_call_missed_fill);
                        if (drawableO9 != null) {
                            sb8.m0(c0a.h(a8gVar, context10).d, drawableO9);
                            return drawableO9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Context context11 = e13Var.b;
                        Drawable drawableO10 = wk8.o(context11, R.drawable.icon_forward_fill);
                        if (drawableO10 != null) {
                            sb8.m0(c0a.h(a8gVar, context11).d, drawableO10);
                            return drawableO10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Context context12 = e13Var.b;
                        Drawable drawableO11 = wk8.o(context12, R.drawable.icon_video_call_missed_fill);
                        if (drawableO11 != null) {
                            sb8.m0(c0a.h(a8gVar, context12).d, drawableO11);
                            return drawableO11;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Context context13 = e13Var.b;
                        Drawable drawableO12 = wk8.o(context13, R.drawable.icon_play_fill);
                        if (drawableO12 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        a8gVar.e(context13).m();
                        sb8.m0(-1, drawableO12);
                        return drawableO12;
                    case 14:
                        Context context14 = e13Var.b;
                        Drawable drawableO13 = wk8.o(context14, R.drawable.icon_poll_fill);
                        if (drawableO13 != null) {
                            sb8.m0(c0a.h(a8gVar, context14).d, drawableO13);
                            return drawableO13;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Context context15 = e13Var.b;
                        return Build.VERSION.SDK_INT >= 33 ? context15 : ((jc9) e13Var.a.getValue()).c(context15);
                    default:
                        return new FitFontImageSpan(new qoh(e13Var.b), kw6.a, false, false, 12, null);
                }
            }
        });
        final int i11 = 12;
        this.x = new ifh(new af7(this) { // from class: v03
            public final /* synthetic */ e13 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i12 = i11;
                a8g a8gVar = pq3.j;
                e13 e13Var = this.b;
                switch (i12) {
                    case 0:
                        return new FitFontImageSpan(new umg(e13Var.b), kw6.a, false, false, 12, null);
                    case 1:
                        return new FitFontImageSpan(new et6(e13Var.b), kw6.a, false, false, 12, null);
                    case 2:
                        Context context2 = e13Var.b;
                        Drawable drawableO = wk8.o(context2, R.drawable.icon_phone_book_fill);
                        if (drawableO != null) {
                            sb8.m0(c0a.h(a8gVar, context2).d, drawableO);
                            return drawableO;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 3:
                        Context context3 = e13Var.b;
                        Drawable drawableO2 = wk8.o(context3, R.drawable.icon_file);
                        if (drawableO2 != null) {
                            sb8.m0(c0a.h(a8gVar, context3).d, drawableO2);
                            return drawableO2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 4:
                        Context context4 = e13Var.b;
                        Drawable drawableO3 = wk8.o(context4, R.drawable.icon_microphone_fill);
                        if (drawableO3 != null) {
                            sb8.m0(c0a.h(a8gVar, context4).d, drawableO3);
                            return drawableO3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 5:
                        Context context5 = e13Var.b;
                        Drawable drawableO4 = wk8.o(context5, R.drawable.icon_geolocation_fill_mini);
                        if (drawableO4 != null) {
                            sb8.m0(c0a.h(a8gVar, context5).d, drawableO4);
                            return drawableO4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 6:
                        Context context6 = e13Var.b;
                        Drawable drawableO5 = wk8.o(context6, R.drawable.icon_call_outgoing_fill);
                        if (drawableO5 != null) {
                            sb8.m0(c0a.h(a8gVar, context6).d, drawableO5);
                            return drawableO5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Context context7 = e13Var.b;
                        Drawable drawableO6 = wk8.o(context7, R.drawable.icon_video_call_outgoing_fill);
                        if (drawableO6 != null) {
                            sb8.m0(c0a.h(a8gVar, context7).d, drawableO6);
                            return drawableO6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Context context8 = e13Var.b;
                        Drawable drawableO7 = wk8.o(context8, R.drawable.icon_call_incoming_fill);
                        if (drawableO7 != null) {
                            sb8.m0(c0a.h(a8gVar, context8).d, drawableO7);
                            return drawableO7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        Context context9 = e13Var.b;
                        Drawable drawableO8 = wk8.o(context9, R.drawable.icon_video_call_incoming_fill);
                        if (drawableO8 != null) {
                            sb8.m0(c0a.h(a8gVar, context9).d, drawableO8);
                            return drawableO8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 10:
                        Context context10 = e13Var.b;
                        Drawable drawableO9 = wk8.o(context10, R.drawable.icon_call_missed_fill);
                        if (drawableO9 != null) {
                            sb8.m0(c0a.h(a8gVar, context10).d, drawableO9);
                            return drawableO9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Context context11 = e13Var.b;
                        Drawable drawableO10 = wk8.o(context11, R.drawable.icon_forward_fill);
                        if (drawableO10 != null) {
                            sb8.m0(c0a.h(a8gVar, context11).d, drawableO10);
                            return drawableO10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Context context12 = e13Var.b;
                        Drawable drawableO11 = wk8.o(context12, R.drawable.icon_video_call_missed_fill);
                        if (drawableO11 != null) {
                            sb8.m0(c0a.h(a8gVar, context12).d, drawableO11);
                            return drawableO11;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Context context13 = e13Var.b;
                        Drawable drawableO12 = wk8.o(context13, R.drawable.icon_play_fill);
                        if (drawableO12 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        a8gVar.e(context13).m();
                        sb8.m0(-1, drawableO12);
                        return drawableO12;
                    case 14:
                        Context context14 = e13Var.b;
                        Drawable drawableO13 = wk8.o(context14, R.drawable.icon_poll_fill);
                        if (drawableO13 != null) {
                            sb8.m0(c0a.h(a8gVar, context14).d, drawableO13);
                            return drawableO13;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Context context15 = e13Var.b;
                        return Build.VERSION.SDK_INT >= 33 ? context15 : ((jc9) e13Var.a.getValue()).c(context15);
                    default:
                        return new FitFontImageSpan(new qoh(e13Var.b), kw6.a, false, false, 12, null);
                }
            }
        });
        final int i12 = 13;
        this.y = new ifh(new af7(this) { // from class: v03
            public final /* synthetic */ e13 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i13 = i12;
                a8g a8gVar = pq3.j;
                e13 e13Var = this.b;
                switch (i13) {
                    case 0:
                        return new FitFontImageSpan(new umg(e13Var.b), kw6.a, false, false, 12, null);
                    case 1:
                        return new FitFontImageSpan(new et6(e13Var.b), kw6.a, false, false, 12, null);
                    case 2:
                        Context context2 = e13Var.b;
                        Drawable drawableO = wk8.o(context2, R.drawable.icon_phone_book_fill);
                        if (drawableO != null) {
                            sb8.m0(c0a.h(a8gVar, context2).d, drawableO);
                            return drawableO;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 3:
                        Context context3 = e13Var.b;
                        Drawable drawableO2 = wk8.o(context3, R.drawable.icon_file);
                        if (drawableO2 != null) {
                            sb8.m0(c0a.h(a8gVar, context3).d, drawableO2);
                            return drawableO2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 4:
                        Context context4 = e13Var.b;
                        Drawable drawableO3 = wk8.o(context4, R.drawable.icon_microphone_fill);
                        if (drawableO3 != null) {
                            sb8.m0(c0a.h(a8gVar, context4).d, drawableO3);
                            return drawableO3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 5:
                        Context context5 = e13Var.b;
                        Drawable drawableO4 = wk8.o(context5, R.drawable.icon_geolocation_fill_mini);
                        if (drawableO4 != null) {
                            sb8.m0(c0a.h(a8gVar, context5).d, drawableO4);
                            return drawableO4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 6:
                        Context context6 = e13Var.b;
                        Drawable drawableO5 = wk8.o(context6, R.drawable.icon_call_outgoing_fill);
                        if (drawableO5 != null) {
                            sb8.m0(c0a.h(a8gVar, context6).d, drawableO5);
                            return drawableO5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Context context7 = e13Var.b;
                        Drawable drawableO6 = wk8.o(context7, R.drawable.icon_video_call_outgoing_fill);
                        if (drawableO6 != null) {
                            sb8.m0(c0a.h(a8gVar, context7).d, drawableO6);
                            return drawableO6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Context context8 = e13Var.b;
                        Drawable drawableO7 = wk8.o(context8, R.drawable.icon_call_incoming_fill);
                        if (drawableO7 != null) {
                            sb8.m0(c0a.h(a8gVar, context8).d, drawableO7);
                            return drawableO7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        Context context9 = e13Var.b;
                        Drawable drawableO8 = wk8.o(context9, R.drawable.icon_video_call_incoming_fill);
                        if (drawableO8 != null) {
                            sb8.m0(c0a.h(a8gVar, context9).d, drawableO8);
                            return drawableO8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 10:
                        Context context10 = e13Var.b;
                        Drawable drawableO9 = wk8.o(context10, R.drawable.icon_call_missed_fill);
                        if (drawableO9 != null) {
                            sb8.m0(c0a.h(a8gVar, context10).d, drawableO9);
                            return drawableO9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Context context11 = e13Var.b;
                        Drawable drawableO10 = wk8.o(context11, R.drawable.icon_forward_fill);
                        if (drawableO10 != null) {
                            sb8.m0(c0a.h(a8gVar, context11).d, drawableO10);
                            return drawableO10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Context context12 = e13Var.b;
                        Drawable drawableO11 = wk8.o(context12, R.drawable.icon_video_call_missed_fill);
                        if (drawableO11 != null) {
                            sb8.m0(c0a.h(a8gVar, context12).d, drawableO11);
                            return drawableO11;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Context context13 = e13Var.b;
                        Drawable drawableO12 = wk8.o(context13, R.drawable.icon_play_fill);
                        if (drawableO12 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        a8gVar.e(context13).m();
                        sb8.m0(-1, drawableO12);
                        return drawableO12;
                    case 14:
                        Context context14 = e13Var.b;
                        Drawable drawableO13 = wk8.o(context14, R.drawable.icon_poll_fill);
                        if (drawableO13 != null) {
                            sb8.m0(c0a.h(a8gVar, context14).d, drawableO13);
                            return drawableO13;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Context context15 = e13Var.b;
                        return Build.VERSION.SDK_INT >= 33 ? context15 : ((jc9) e13Var.a.getValue()).c(context15);
                    default:
                        return new FitFontImageSpan(new qoh(e13Var.b), kw6.a, false, false, 12, null);
                }
            }
        });
        final int i13 = 14;
        this.z = new ifh(new af7(this) { // from class: v03
            public final /* synthetic */ e13 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i14 = i13;
                a8g a8gVar = pq3.j;
                e13 e13Var = this.b;
                switch (i14) {
                    case 0:
                        return new FitFontImageSpan(new umg(e13Var.b), kw6.a, false, false, 12, null);
                    case 1:
                        return new FitFontImageSpan(new et6(e13Var.b), kw6.a, false, false, 12, null);
                    case 2:
                        Context context2 = e13Var.b;
                        Drawable drawableO = wk8.o(context2, R.drawable.icon_phone_book_fill);
                        if (drawableO != null) {
                            sb8.m0(c0a.h(a8gVar, context2).d, drawableO);
                            return drawableO;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 3:
                        Context context3 = e13Var.b;
                        Drawable drawableO2 = wk8.o(context3, R.drawable.icon_file);
                        if (drawableO2 != null) {
                            sb8.m0(c0a.h(a8gVar, context3).d, drawableO2);
                            return drawableO2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 4:
                        Context context4 = e13Var.b;
                        Drawable drawableO3 = wk8.o(context4, R.drawable.icon_microphone_fill);
                        if (drawableO3 != null) {
                            sb8.m0(c0a.h(a8gVar, context4).d, drawableO3);
                            return drawableO3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 5:
                        Context context5 = e13Var.b;
                        Drawable drawableO4 = wk8.o(context5, R.drawable.icon_geolocation_fill_mini);
                        if (drawableO4 != null) {
                            sb8.m0(c0a.h(a8gVar, context5).d, drawableO4);
                            return drawableO4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 6:
                        Context context6 = e13Var.b;
                        Drawable drawableO5 = wk8.o(context6, R.drawable.icon_call_outgoing_fill);
                        if (drawableO5 != null) {
                            sb8.m0(c0a.h(a8gVar, context6).d, drawableO5);
                            return drawableO5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Context context7 = e13Var.b;
                        Drawable drawableO6 = wk8.o(context7, R.drawable.icon_video_call_outgoing_fill);
                        if (drawableO6 != null) {
                            sb8.m0(c0a.h(a8gVar, context7).d, drawableO6);
                            return drawableO6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Context context8 = e13Var.b;
                        Drawable drawableO7 = wk8.o(context8, R.drawable.icon_call_incoming_fill);
                        if (drawableO7 != null) {
                            sb8.m0(c0a.h(a8gVar, context8).d, drawableO7);
                            return drawableO7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        Context context9 = e13Var.b;
                        Drawable drawableO8 = wk8.o(context9, R.drawable.icon_video_call_incoming_fill);
                        if (drawableO8 != null) {
                            sb8.m0(c0a.h(a8gVar, context9).d, drawableO8);
                            return drawableO8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 10:
                        Context context10 = e13Var.b;
                        Drawable drawableO9 = wk8.o(context10, R.drawable.icon_call_missed_fill);
                        if (drawableO9 != null) {
                            sb8.m0(c0a.h(a8gVar, context10).d, drawableO9);
                            return drawableO9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Context context11 = e13Var.b;
                        Drawable drawableO10 = wk8.o(context11, R.drawable.icon_forward_fill);
                        if (drawableO10 != null) {
                            sb8.m0(c0a.h(a8gVar, context11).d, drawableO10);
                            return drawableO10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Context context12 = e13Var.b;
                        Drawable drawableO11 = wk8.o(context12, R.drawable.icon_video_call_missed_fill);
                        if (drawableO11 != null) {
                            sb8.m0(c0a.h(a8gVar, context12).d, drawableO11);
                            return drawableO11;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Context context13 = e13Var.b;
                        Drawable drawableO12 = wk8.o(context13, R.drawable.icon_play_fill);
                        if (drawableO12 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        a8gVar.e(context13).m();
                        sb8.m0(-1, drawableO12);
                        return drawableO12;
                    case 14:
                        Context context14 = e13Var.b;
                        Drawable drawableO13 = wk8.o(context14, R.drawable.icon_poll_fill);
                        if (drawableO13 != null) {
                            sb8.m0(c0a.h(a8gVar, context14).d, drawableO13);
                            return drawableO13;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Context context15 = e13Var.b;
                        return Build.VERSION.SDK_INT >= 33 ? context15 : ((jc9) e13Var.a.getValue()).c(context15);
                    default:
                        return new FitFontImageSpan(new qoh(e13Var.b), kw6.a, false, false, 12, null);
                }
            }
        });
        final int i14 = 15;
        this.A = new wme(new af7(this) { // from class: v03
            public final /* synthetic */ e13 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i15 = i14;
                a8g a8gVar = pq3.j;
                e13 e13Var = this.b;
                switch (i15) {
                    case 0:
                        return new FitFontImageSpan(new umg(e13Var.b), kw6.a, false, false, 12, null);
                    case 1:
                        return new FitFontImageSpan(new et6(e13Var.b), kw6.a, false, false, 12, null);
                    case 2:
                        Context context2 = e13Var.b;
                        Drawable drawableO = wk8.o(context2, R.drawable.icon_phone_book_fill);
                        if (drawableO != null) {
                            sb8.m0(c0a.h(a8gVar, context2).d, drawableO);
                            return drawableO;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 3:
                        Context context3 = e13Var.b;
                        Drawable drawableO2 = wk8.o(context3, R.drawable.icon_file);
                        if (drawableO2 != null) {
                            sb8.m0(c0a.h(a8gVar, context3).d, drawableO2);
                            return drawableO2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 4:
                        Context context4 = e13Var.b;
                        Drawable drawableO3 = wk8.o(context4, R.drawable.icon_microphone_fill);
                        if (drawableO3 != null) {
                            sb8.m0(c0a.h(a8gVar, context4).d, drawableO3);
                            return drawableO3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 5:
                        Context context5 = e13Var.b;
                        Drawable drawableO4 = wk8.o(context5, R.drawable.icon_geolocation_fill_mini);
                        if (drawableO4 != null) {
                            sb8.m0(c0a.h(a8gVar, context5).d, drawableO4);
                            return drawableO4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 6:
                        Context context6 = e13Var.b;
                        Drawable drawableO5 = wk8.o(context6, R.drawable.icon_call_outgoing_fill);
                        if (drawableO5 != null) {
                            sb8.m0(c0a.h(a8gVar, context6).d, drawableO5);
                            return drawableO5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Context context7 = e13Var.b;
                        Drawable drawableO6 = wk8.o(context7, R.drawable.icon_video_call_outgoing_fill);
                        if (drawableO6 != null) {
                            sb8.m0(c0a.h(a8gVar, context7).d, drawableO6);
                            return drawableO6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Context context8 = e13Var.b;
                        Drawable drawableO7 = wk8.o(context8, R.drawable.icon_call_incoming_fill);
                        if (drawableO7 != null) {
                            sb8.m0(c0a.h(a8gVar, context8).d, drawableO7);
                            return drawableO7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        Context context9 = e13Var.b;
                        Drawable drawableO8 = wk8.o(context9, R.drawable.icon_video_call_incoming_fill);
                        if (drawableO8 != null) {
                            sb8.m0(c0a.h(a8gVar, context9).d, drawableO8);
                            return drawableO8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 10:
                        Context context10 = e13Var.b;
                        Drawable drawableO9 = wk8.o(context10, R.drawable.icon_call_missed_fill);
                        if (drawableO9 != null) {
                            sb8.m0(c0a.h(a8gVar, context10).d, drawableO9);
                            return drawableO9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Context context11 = e13Var.b;
                        Drawable drawableO10 = wk8.o(context11, R.drawable.icon_forward_fill);
                        if (drawableO10 != null) {
                            sb8.m0(c0a.h(a8gVar, context11).d, drawableO10);
                            return drawableO10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Context context12 = e13Var.b;
                        Drawable drawableO11 = wk8.o(context12, R.drawable.icon_video_call_missed_fill);
                        if (drawableO11 != null) {
                            sb8.m0(c0a.h(a8gVar, context12).d, drawableO11);
                            return drawableO11;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Context context13 = e13Var.b;
                        Drawable drawableO12 = wk8.o(context13, R.drawable.icon_play_fill);
                        if (drawableO12 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        a8gVar.e(context13).m();
                        sb8.m0(-1, drawableO12);
                        return drawableO12;
                    case 14:
                        Context context14 = e13Var.b;
                        Drawable drawableO13 = wk8.o(context14, R.drawable.icon_poll_fill);
                        if (drawableO13 != null) {
                            sb8.m0(c0a.h(a8gVar, context14).d, drawableO13);
                            return drawableO13;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Context context15 = e13Var.b;
                        return Build.VERSION.SDK_INT >= 33 ? context15 : ((jc9) e13Var.a.getValue()).c(context15);
                    default:
                        return new FitFontImageSpan(new qoh(e13Var.b), kw6.a, false, false, 12, null);
                }
            }
        });
        final int i15 = 16;
        this.B = new ifh(new af7(this) { // from class: v03
            public final /* synthetic */ e13 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i16 = i15;
                a8g a8gVar = pq3.j;
                e13 e13Var = this.b;
                switch (i16) {
                    case 0:
                        return new FitFontImageSpan(new umg(e13Var.b), kw6.a, false, false, 12, null);
                    case 1:
                        return new FitFontImageSpan(new et6(e13Var.b), kw6.a, false, false, 12, null);
                    case 2:
                        Context context2 = e13Var.b;
                        Drawable drawableO = wk8.o(context2, R.drawable.icon_phone_book_fill);
                        if (drawableO != null) {
                            sb8.m0(c0a.h(a8gVar, context2).d, drawableO);
                            return drawableO;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 3:
                        Context context3 = e13Var.b;
                        Drawable drawableO2 = wk8.o(context3, R.drawable.icon_file);
                        if (drawableO2 != null) {
                            sb8.m0(c0a.h(a8gVar, context3).d, drawableO2);
                            return drawableO2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 4:
                        Context context4 = e13Var.b;
                        Drawable drawableO3 = wk8.o(context4, R.drawable.icon_microphone_fill);
                        if (drawableO3 != null) {
                            sb8.m0(c0a.h(a8gVar, context4).d, drawableO3);
                            return drawableO3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 5:
                        Context context5 = e13Var.b;
                        Drawable drawableO4 = wk8.o(context5, R.drawable.icon_geolocation_fill_mini);
                        if (drawableO4 != null) {
                            sb8.m0(c0a.h(a8gVar, context5).d, drawableO4);
                            return drawableO4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 6:
                        Context context6 = e13Var.b;
                        Drawable drawableO5 = wk8.o(context6, R.drawable.icon_call_outgoing_fill);
                        if (drawableO5 != null) {
                            sb8.m0(c0a.h(a8gVar, context6).d, drawableO5);
                            return drawableO5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Context context7 = e13Var.b;
                        Drawable drawableO6 = wk8.o(context7, R.drawable.icon_video_call_outgoing_fill);
                        if (drawableO6 != null) {
                            sb8.m0(c0a.h(a8gVar, context7).d, drawableO6);
                            return drawableO6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Context context8 = e13Var.b;
                        Drawable drawableO7 = wk8.o(context8, R.drawable.icon_call_incoming_fill);
                        if (drawableO7 != null) {
                            sb8.m0(c0a.h(a8gVar, context8).d, drawableO7);
                            return drawableO7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        Context context9 = e13Var.b;
                        Drawable drawableO8 = wk8.o(context9, R.drawable.icon_video_call_incoming_fill);
                        if (drawableO8 != null) {
                            sb8.m0(c0a.h(a8gVar, context9).d, drawableO8);
                            return drawableO8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 10:
                        Context context10 = e13Var.b;
                        Drawable drawableO9 = wk8.o(context10, R.drawable.icon_call_missed_fill);
                        if (drawableO9 != null) {
                            sb8.m0(c0a.h(a8gVar, context10).d, drawableO9);
                            return drawableO9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Context context11 = e13Var.b;
                        Drawable drawableO10 = wk8.o(context11, R.drawable.icon_forward_fill);
                        if (drawableO10 != null) {
                            sb8.m0(c0a.h(a8gVar, context11).d, drawableO10);
                            return drawableO10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Context context12 = e13Var.b;
                        Drawable drawableO11 = wk8.o(context12, R.drawable.icon_video_call_missed_fill);
                        if (drawableO11 != null) {
                            sb8.m0(c0a.h(a8gVar, context12).d, drawableO11);
                            return drawableO11;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Context context13 = e13Var.b;
                        Drawable drawableO12 = wk8.o(context13, R.drawable.icon_play_fill);
                        if (drawableO12 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        a8gVar.e(context13).m();
                        sb8.m0(-1, drawableO12);
                        return drawableO12;
                    case 14:
                        Context context14 = e13Var.b;
                        Drawable drawableO13 = wk8.o(context14, R.drawable.icon_poll_fill);
                        if (drawableO13 != null) {
                            sb8.m0(c0a.h(a8gVar, context14).d, drawableO13);
                            return drawableO13;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Context context15 = e13Var.b;
                        return Build.VERSION.SDK_INT >= 33 ? context15 : ((jc9) e13Var.a.getValue()).c(context15);
                    default:
                        return new FitFontImageSpan(new qoh(e13Var.b), kw6.a, false, false, 12, null);
                }
            }
        });
        this.C = new ifh(new b6(24));
        final int i16 = 0;
        this.D = new ifh(new af7(this) { // from class: v03
            public final /* synthetic */ e13 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i17 = i16;
                a8g a8gVar = pq3.j;
                e13 e13Var = this.b;
                switch (i17) {
                    case 0:
                        return new FitFontImageSpan(new umg(e13Var.b), kw6.a, false, false, 12, null);
                    case 1:
                        return new FitFontImageSpan(new et6(e13Var.b), kw6.a, false, false, 12, null);
                    case 2:
                        Context context2 = e13Var.b;
                        Drawable drawableO = wk8.o(context2, R.drawable.icon_phone_book_fill);
                        if (drawableO != null) {
                            sb8.m0(c0a.h(a8gVar, context2).d, drawableO);
                            return drawableO;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 3:
                        Context context3 = e13Var.b;
                        Drawable drawableO2 = wk8.o(context3, R.drawable.icon_file);
                        if (drawableO2 != null) {
                            sb8.m0(c0a.h(a8gVar, context3).d, drawableO2);
                            return drawableO2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 4:
                        Context context4 = e13Var.b;
                        Drawable drawableO3 = wk8.o(context4, R.drawable.icon_microphone_fill);
                        if (drawableO3 != null) {
                            sb8.m0(c0a.h(a8gVar, context4).d, drawableO3);
                            return drawableO3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 5:
                        Context context5 = e13Var.b;
                        Drawable drawableO4 = wk8.o(context5, R.drawable.icon_geolocation_fill_mini);
                        if (drawableO4 != null) {
                            sb8.m0(c0a.h(a8gVar, context5).d, drawableO4);
                            return drawableO4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 6:
                        Context context6 = e13Var.b;
                        Drawable drawableO5 = wk8.o(context6, R.drawable.icon_call_outgoing_fill);
                        if (drawableO5 != null) {
                            sb8.m0(c0a.h(a8gVar, context6).d, drawableO5);
                            return drawableO5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Context context7 = e13Var.b;
                        Drawable drawableO6 = wk8.o(context7, R.drawable.icon_video_call_outgoing_fill);
                        if (drawableO6 != null) {
                            sb8.m0(c0a.h(a8gVar, context7).d, drawableO6);
                            return drawableO6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Context context8 = e13Var.b;
                        Drawable drawableO7 = wk8.o(context8, R.drawable.icon_call_incoming_fill);
                        if (drawableO7 != null) {
                            sb8.m0(c0a.h(a8gVar, context8).d, drawableO7);
                            return drawableO7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        Context context9 = e13Var.b;
                        Drawable drawableO8 = wk8.o(context9, R.drawable.icon_video_call_incoming_fill);
                        if (drawableO8 != null) {
                            sb8.m0(c0a.h(a8gVar, context9).d, drawableO8);
                            return drawableO8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 10:
                        Context context10 = e13Var.b;
                        Drawable drawableO9 = wk8.o(context10, R.drawable.icon_call_missed_fill);
                        if (drawableO9 != null) {
                            sb8.m0(c0a.h(a8gVar, context10).d, drawableO9);
                            return drawableO9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Context context11 = e13Var.b;
                        Drawable drawableO10 = wk8.o(context11, R.drawable.icon_forward_fill);
                        if (drawableO10 != null) {
                            sb8.m0(c0a.h(a8gVar, context11).d, drawableO10);
                            return drawableO10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Context context12 = e13Var.b;
                        Drawable drawableO11 = wk8.o(context12, R.drawable.icon_video_call_missed_fill);
                        if (drawableO11 != null) {
                            sb8.m0(c0a.h(a8gVar, context12).d, drawableO11);
                            return drawableO11;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Context context13 = e13Var.b;
                        Drawable drawableO12 = wk8.o(context13, R.drawable.icon_play_fill);
                        if (drawableO12 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        a8gVar.e(context13).m();
                        sb8.m0(-1, drawableO12);
                        return drawableO12;
                    case 14:
                        Context context14 = e13Var.b;
                        Drawable drawableO13 = wk8.o(context14, R.drawable.icon_poll_fill);
                        if (drawableO13 != null) {
                            sb8.m0(c0a.h(a8gVar, context14).d, drawableO13);
                            return drawableO13;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Context context15 = e13Var.b;
                        return Build.VERSION.SDK_INT >= 33 ? context15 : ((jc9) e13Var.a.getValue()).c(context15);
                    default:
                        return new FitFontImageSpan(new qoh(e13Var.b), kw6.a, false, false, 12, null);
                }
            }
        });
        this.E = new ifh(new b6(25));
        final int i17 = 1;
        this.F = new ifh(new af7(this) { // from class: v03
            public final /* synthetic */ e13 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i18 = i17;
                a8g a8gVar = pq3.j;
                e13 e13Var = this.b;
                switch (i18) {
                    case 0:
                        return new FitFontImageSpan(new umg(e13Var.b), kw6.a, false, false, 12, null);
                    case 1:
                        return new FitFontImageSpan(new et6(e13Var.b), kw6.a, false, false, 12, null);
                    case 2:
                        Context context2 = e13Var.b;
                        Drawable drawableO = wk8.o(context2, R.drawable.icon_phone_book_fill);
                        if (drawableO != null) {
                            sb8.m0(c0a.h(a8gVar, context2).d, drawableO);
                            return drawableO;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 3:
                        Context context3 = e13Var.b;
                        Drawable drawableO2 = wk8.o(context3, R.drawable.icon_file);
                        if (drawableO2 != null) {
                            sb8.m0(c0a.h(a8gVar, context3).d, drawableO2);
                            return drawableO2;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 4:
                        Context context4 = e13Var.b;
                        Drawable drawableO3 = wk8.o(context4, R.drawable.icon_microphone_fill);
                        if (drawableO3 != null) {
                            sb8.m0(c0a.h(a8gVar, context4).d, drawableO3);
                            return drawableO3;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 5:
                        Context context5 = e13Var.b;
                        Drawable drawableO4 = wk8.o(context5, R.drawable.icon_geolocation_fill_mini);
                        if (drawableO4 != null) {
                            sb8.m0(c0a.h(a8gVar, context5).d, drawableO4);
                            return drawableO4;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 6:
                        Context context6 = e13Var.b;
                        Drawable drawableO5 = wk8.o(context6, R.drawable.icon_call_outgoing_fill);
                        if (drawableO5 != null) {
                            sb8.m0(c0a.h(a8gVar, context6).d, drawableO5);
                            return drawableO5;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 7:
                        Context context7 = e13Var.b;
                        Drawable drawableO6 = wk8.o(context7, R.drawable.icon_video_call_outgoing_fill);
                        if (drawableO6 != null) {
                            sb8.m0(c0a.h(a8gVar, context7).d, drawableO6);
                            return drawableO6;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 8:
                        Context context8 = e13Var.b;
                        Drawable drawableO7 = wk8.o(context8, R.drawable.icon_call_incoming_fill);
                        if (drawableO7 != null) {
                            sb8.m0(c0a.h(a8gVar, context8).d, drawableO7);
                            return drawableO7;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 9:
                        Context context9 = e13Var.b;
                        Drawable drawableO8 = wk8.o(context9, R.drawable.icon_video_call_incoming_fill);
                        if (drawableO8 != null) {
                            sb8.m0(c0a.h(a8gVar, context9).d, drawableO8);
                            return drawableO8;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 10:
                        Context context10 = e13Var.b;
                        Drawable drawableO9 = wk8.o(context10, R.drawable.icon_call_missed_fill);
                        if (drawableO9 != null) {
                            sb8.m0(c0a.h(a8gVar, context10).d, drawableO9);
                            return drawableO9;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 11:
                        Context context11 = e13Var.b;
                        Drawable drawableO10 = wk8.o(context11, R.drawable.icon_forward_fill);
                        if (drawableO10 != null) {
                            sb8.m0(c0a.h(a8gVar, context11).d, drawableO10);
                            return drawableO10;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 12:
                        Context context12 = e13Var.b;
                        Drawable drawableO11 = wk8.o(context12, R.drawable.icon_video_call_missed_fill);
                        if (drawableO11 != null) {
                            sb8.m0(c0a.h(a8gVar, context12).d, drawableO11);
                            return drawableO11;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 13:
                        Context context13 = e13Var.b;
                        Drawable drawableO12 = wk8.o(context13, R.drawable.icon_play_fill);
                        if (drawableO12 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        a8gVar.e(context13).m();
                        sb8.m0(-1, drawableO12);
                        return drawableO12;
                    case 14:
                        Context context14 = e13Var.b;
                        Drawable drawableO13 = wk8.o(context14, R.drawable.icon_poll_fill);
                        if (drawableO13 != null) {
                            sb8.m0(c0a.h(a8gVar, context14).d, drawableO13);
                            return drawableO13;
                        }
                        ore.p("Required value was null.");
                        return null;
                    case 15:
                        Context context15 = e13Var.b;
                        return Build.VERSION.SDK_INT >= 33 ? context15 : ((jc9) e13Var.a.getValue()).c(context15);
                    default:
                        return new FitFontImageSpan(new qoh(e13Var.b), kw6.a, false, false, 12, null);
                }
            }
        });
        this.G = new c13(this);
        this.H = e13.class.getName();
        this.I = new d13(ny8Var2, ny8Var, this);
        context.registerComponentCallbacks(new x03(0, this));
        e9i.j0(new fz6((r8e) pq3.j.e(context).h, new y73(this, (lq4) null, 4), 3), cqk.a(((n0c) xhhVar).c()));
    }

    public static /* synthetic */ SpannableString g(e13 e13Var, rt2 rt2Var, fda fdaVar, int i) {
        return e13Var.f(rt2Var, fdaVar, i, false);
    }

    public final boolean a(int i, rt2 rt2Var, fda fdaVar, SpannableStringBuilder spannableStringBuilder, boolean z) {
        if (i == 1 || z) {
            return false;
        }
        sfa sfaVar = fdaVar.a;
        vg4 vg4Var = fdaVar.b;
        if (sfaVar.M()) {
            return false;
        }
        long jV = vg4Var.v();
        long jLongValue = ((Number) this.c.invoke()).longValue();
        a8g a8gVar = pq3.j;
        Context context = this.b;
        if (jV == jLongValue) {
            if (!rt2Var.e0()) {
                return false;
            }
            sb8.c(spannableStringBuilder, zo5.o(context.getString(R.string.tt_you), ":"), new fqh(a8gVar.e(context).m(), new c6(18)));
            spannableStringBuilder.append((char) 8288);
            sb8.b(spannableStringBuilder, (char) 8203, new tdg(gm0.K(6.0f * yl5.d().getDisplayMetrics().density)));
            spannableStringBuilder.append((char) 8288);
            return true;
        }
        if (!rt2Var.e0()) {
            return false;
        }
        tvb tvbVar = new tvb(context, awb.a);
        af7 af7Var = this.d;
        tvb.d(tvbVar, ((ts0) af7Var.invoke()).b);
        ny8 ny8Var = this.j;
        tvbVar.c(vg4Var.u(), Long.valueOf(vg4Var.v()), jcd.d((jcd) ny8Var.getValue(), vg4Var, null, 2) ? ((jcd) ny8Var.getValue()).a().toString() : vg4Var.y((ts0) af7Var.invoke()));
        sb8.b(spannableStringBuilder, (char) 8203, new FitFontImageSpan(tvbVar, null, false, false, 14, null));
        spannableStringBuilder.append((char) 8288);
        sb8.b(spannableStringBuilder, (char) 8203, new tdg(gm0.K(4.0f * yl5.d().getDisplayMetrics().density)));
        spannableStringBuilder.append((char) 8288);
        sb8.c(spannableStringBuilder, String.valueOf(vg4Var.k()), new fqh(a8gVar.e(context).m(), new xk1(23)));
        spannableStringBuilder.append((char) 8288);
        if (vg4Var.G()) {
            spannableStringBuilder.append(" ");
            spannableStringBuilder.setSpan(new qsi(context, 1, true, er3.d), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((char) 8288);
        }
        sb8.c(spannableStringBuilder, ":", new fqh(a8gVar.e(context).m(), new xk1(24)));
        spannableStringBuilder.append((char) 8288);
        sb8.b(spannableStringBuilder, (char) 8203, new tdg(gm0.K(6.0f * yl5.d().getDisplayMetrics().density)));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0206  */
    public final void b(SpannableStringBuilder spannableStringBuilder, fda fdaVar, boolean z, long j) {
        Drawable drawable;
        kx6 kx6Var;
        ohf ohfVarD = b76.a;
        sfa sfaVar = fdaVar.a;
        int i = 0;
        if (sfaVar == null) {
            String str = this.H;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, str, "Empty MessageDb while process message", null, null, 8);
            }
        } else if (sfaVar.E()) {
            sw swVar = new sw(2, (Drawable) this.n.getValue());
            if ((sfaVar.W() || sfaVar.V()) && sfaVar.E() && fdaVar.b() != null) {
                ohfVarD = d(fdaVar, j);
            }
            ohf ohfVarK0 = a.K0(new ohf[]{swVar, ohfVarD});
            nre nreVar = new nre(4);
            if (ohfVarK0 instanceof m2i) {
                m2i m2iVar = (m2i) ohfVarK0;
                kx6Var = new kx6(m2iVar.a, m2iVar.b, nreVar);
            } else {
                kx6Var = new kx6(ohfVarK0, new nre(3), nreVar);
            }
            ohfVarD = kx6Var;
        } else if (sfaVar.L()) {
            ohfVarD = new sw(2, (Drawable) this.o.getValue());
        } else if (sfaVar.P()) {
            jr6 jr6Var = new jr6(this.b);
            jr6Var.a(ou7.f(cqk.u(sfaVar.r())));
            ohfVarD = new sw(2, jr6Var);
        } else if (sfaVar.J()) {
            ohfVarD = new sw(2, (Drawable) this.q.getValue());
        } else if (sfaVar.Q()) {
            ohfVarD = new sw(2, (Drawable) this.r.getValue());
        } else if (sfaVar.K()) {
            if (sfaVar.K()) {
                e60 e60VarO = sfaVar.o();
                boolean zJ = e60VarO != null ? e60VarO.j() : false;
                e60 e60VarO2 = sfaVar.o();
                boolean zG = e60VarO2 != null ? e60VarO2.g() : false;
                boolean z2 = fdaVar.d() && (fdaVar.e() || zG || zJ);
                boolean z3 = !fdaVar.d() && (zG || zJ);
                e60 e60VarO3 = sfaVar.o();
                if (e60VarO3 != null && e60VarO3.k() && (z3 || z2)) {
                    drawable = (Drawable) this.x.getValue();
                } else {
                    e60 e60VarO4 = sfaVar.o();
                    if (e60VarO4 != null && e60VarO4.k() && fdaVar.d()) {
                        drawable = (Drawable) this.v.getValue();
                    } else {
                        e60 e60VarO5 = sfaVar.o();
                        if (e60VarO5 == null || !e60VarO5.k()) {
                            e60 e60VarO6 = sfaVar.o();
                            if (e60VarO6 == null || e60VarO6.k() || !(z3 || z2)) {
                                e60 e60VarO7 = sfaVar.o();
                                if (e60VarO7 == null || e60VarO7.k() || !fdaVar.d()) {
                                    e60 e60VarO8 = sfaVar.o();
                                    drawable = (e60VarO8 == null || !e60VarO8.k()) ? (Drawable) this.s.getValue() : (Drawable) this.s.getValue();
                                } else {
                                    drawable = (Drawable) this.u.getValue();
                                }
                            } else {
                                drawable = (Drawable) this.w.getValue();
                            }
                        } else {
                            drawable = (Drawable) this.t.getValue();
                        }
                    }
                }
            } else {
                drawable = null;
            }
            if (drawable == null) {
                ore.p("Required value was null.");
                return;
            }
            ohfVarD = new sw(2, drawable);
        } else if (sfaVar.S()) {
            e5d e5dVar = (e5d) this.m.getValue();
            o5d o5dVarU = sfaVar.u();
            if (e5dVar.v(o5dVarU != null ? Integer.valueOf(o5dVarU.g()) : null)) {
                ohfVarD = new sw(2, (Drawable) this.z.getValue());
            } else {
                ohfVarD = d(fdaVar, j);
            }
        } else {
            ohfVarD = d(fdaVar, j);
        }
        List listW0 = yhf.w0(ohfVarD);
        if (listW0.isEmpty()) {
            listW0 = null;
        }
        if (listW0 != null) {
            if (!z) {
                sb8.b(spannableStringBuilder, (char) 8203, new tdg(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f)));
                spannableStringBuilder.append((char) 8288);
            }
            for (Object obj : listW0) {
                int i2 = i + 1;
                if (i < 0) {
                    xw3.V0();
                    throw null;
                }
                sb8.b(spannableStringBuilder, (char) 8203, new FitFontImageSpan((Drawable) obj, kw6.a, false, false, 12, null));
                spannableStringBuilder.append((char) 8288);
                if (i < listW0.size() - 1) {
                    sb8.b(spannableStringBuilder, (char) 8203, new tdg(gm0.K(2.0f * yl5.d().getDisplayMetrics().density)));
                    spannableStringBuilder.append((char) 8288);
                }
                i = i2;
            }
            sb8.b(spannableStringBuilder, (char) 8203, new tdg(gm0.K(6.0f * yl5.d().getDisplayMetrics().density)));
            spannableStringBuilder.append((char) 8288);
        }
    }

    public final void c(int i, rt2 rt2Var, fda fdaVar, SpannableStringBuilder spannableStringBuilder, boolean z) {
        kvj kvjVarB;
        Object[] spans;
        je9 je9Var = je9.f;
        sfa sfaVar = fdaVar.a;
        if (sfaVar == null) {
            String str = this.H;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, str, "Empty MessageDb while process message", null, null, 8);
                return;
            }
            return;
        }
        if (sfaVar.W()) {
            CharSequence charSequenceF = ((woh) this.g.getValue()).f(this.b, (p4c) this.f.getValue(), fdaVar.a, false, true, true, false, ((Number) this.c.invoke()).longValue(), false, false);
            if (charSequenceF != null) {
                spannableStringBuilder.append(charSequenceF);
                return;
            }
            return;
        }
        CharSequence charSequence = null;
        Object[] spans2 = null;
        CharSequence charSequence2 = null;
        strD = null;
        String strD = null;
        charSequence = null;
        if (sfaVar.V()) {
            CharSequence charSequenceE = fdaVar.e.e(rt2Var, false);
            if (charSequenceE != null) {
                int i2 = jeg.a;
                jeg jegVarV = ku6.v(charSequenceE);
                try {
                    spans = jegVarV.getSpans(0, jegVarV.length(), ClickableSpan.class);
                } catch (Throwable unused) {
                    spans = null;
                }
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spans;
                if (clickableSpanArr != null) {
                    for (ClickableSpan clickableSpan : clickableSpanArr) {
                        jegVarV.removeSpan(clickableSpan);
                    }
                }
                try {
                    spans2 = jegVarV.getSpans(0, jegVarV.length(), URLSpan.class);
                } catch (Throwable unused2) {
                }
                URLSpan[] uRLSpanArr = (URLSpan[]) spans2;
                if (uRLSpanArr != null) {
                    for (URLSpan uRLSpan : uRLSpanArr) {
                        jegVarV.removeSpan(uRLSpan);
                    }
                }
                charSequence2 = jegVarV;
            } else {
                gm0.Y(e13.class.getName(), "Early return in getLinkText cuz of processedTextNoLinks is null");
            }
            if (charSequence2 != null) {
                spannableStringBuilder.append(charSequence2);
                return;
            }
            return;
        }
        if (sfaVar.M()) {
            h60 h60VarQ = sfaVar.q();
            if ((h60VarQ != null ? h60VarQ.a : 0) == 10) {
                if (!z) {
                    sb8.b(spannableStringBuilder, (char) 8203, new tdg(gm0.K(6.0f * yl5.d().getDisplayMetrics().density)));
                    spannableStringBuilder.append((char) 8288);
                }
                spannableStringBuilder.append(((Context) this.A.getValue()).getString(R.string.oneme_last_message_pinned));
                spannableStringBuilder.append(": ");
                fda fdaVar2 = fdaVar.d;
                if (fdaVar2 != null) {
                    spannableStringBuilder.append(g(this, rt2Var, fdaVar2, 1));
                    return;
                }
                String str2 = this.H;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, zo5.j(fdaVar.a.b, "Pin message is null when try process (isControl && control?.event == Event.PIN), control message sId:"), null);
                    return;
                }
                return;
            }
        }
        if (sfaVar.a0()) {
            qvj qvjVarA = sfaVar.A();
            CharSequence charSequenceS = qvjVarA != null ? qvjVarA.c().s() : null;
            if (qvjVarA != null && (kvjVarB = qvjVarA.b()) != null) {
                strD = kvjVarB.d();
            }
            spannableStringBuilder.append(charSequenceS);
            if (strD == null || strD.length() == 0) {
                return;
            }
            spannableStringBuilder.append(". ");
            spannableStringBuilder.append((CharSequence) strD);
            return;
        }
        if (sfaVar.K()) {
            spannableStringBuilder.append(woh.h((Context) this.A.getValue(), sfaVar, false, true, ((Number) this.c.invoke()).longValue()));
            return;
        }
        if (sfaVar.S()) {
            e5d e5dVar = (e5d) this.m.getValue();
            o5d o5dVarU = sfaVar.u();
            spannableStringBuilder.append(e5dVar.v(o5dVarU != null ? Integer.valueOf(o5dVarU.g()) : null) ? ((p4c) this.f.getValue()).k.d(woh.p(sfaVar, false)) : woh.r(this.b));
            return;
        }
        if (sfaVar.E() && ((tt7) this.k.getValue()).a(sfaVar)) {
            spannableStringBuilder.append(((Context) this.A.getValue()).getString(R.string.messages_list_message_content_level_chat_reply_text));
            return;
        }
        if (sfaVar.E() && fdaVar.b() != null) {
            fda fdaVarB = fdaVar.b();
            while (true) {
                if ((fdaVarB != null ? fdaVarB.b() : null) == null) {
                    break;
                } else {
                    fdaVarB = fdaVarB.b();
                }
            }
            if (fdaVarB != null) {
                spannableStringBuilder.append(f(rt2Var, fdaVarB, i, true));
                return;
            }
            String str3 = this.H;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str3, zo5.j(fdaVar.a.b, "Unreal situation. Forward message is null when try process, message sId:"), null);
                return;
            }
            return;
        }
        if (i == 2) {
            rt2Var.J0();
            CharSequence charSequence3 = rt2Var.k;
            if (charSequence3 != null && charSequence3.length() != 0) {
                charSequence = charSequence3;
            }
            if (charSequence != null) {
                spannableStringBuilder.append(charSequence);
                return;
            }
            return;
        }
        if (i == 1) {
            int iE = (int) (vl5.e(q9i.g.k(bx5.b)) * yl5.d().getDisplayMetrics().density);
            c cVar = fdaVar.e;
            cVar.a(rt2Var);
            cVar.f = rt2Var;
            p4c p4cVar = cVar.a;
            sfa sfaVar2 = cVar.d;
            if (!cVar.q) {
                cVar.j = p4cVar.m(p4cVar.k.c(iE, cVar.c(rt2Var, sfaVar2)), sfaVar2.D, iE);
                cVar.q = true;
            }
            CharSequence charSequence4 = cVar.j;
            if (charSequence4 != null) {
                spannableStringBuilder.append(charSequence4);
            }
        }
    }

    public final ohf d(fda fdaVar, long j) {
        List list;
        c46 c46Var = fdaVar.a.n;
        ohf ohfVarU0 = (c46Var == null || (list = (List) c46Var.a) == null) ? null : yhf.u0(yhf.s0(new sw(1, list), new w03(this, fdaVar, j, 0)), 3);
        return ohfVarU0 == null ? b76.a : ohfVarU0;
    }

    public final CharSequence e(rt2 rt2Var) {
        ny8 ny8Var = this.j;
        Object obj = null;
        boolean zD = jcd.d((jcd) ny8Var.getValue(), null, rt2Var, 1);
        Context context = this.b;
        if (zD) {
            return context.getString(jcd.b((jcd) ny8Var.getValue(), rt2Var, 2));
        }
        Object objC = this.G.c(new y03(rt2Var, this.d));
        CharSequence charSequence = (CharSequence) objC;
        if (charSequence != null && !r5h.X0(charSequence)) {
            obj = objC;
        }
        CharSequence charSequence2 = (CharSequence) obj;
        return (charSequence2 == null && rt2Var.y0()) ? context.getString(R.string.saved_messages_description) : charSequence2;
    }

    public final SpannableString f(rt2 rt2Var, fda fdaVar, int i, boolean z) {
        Object poeVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        try {
            boolean z2 = a(i, rt2Var, fdaVar, spannableStringBuilder, z) || spannableStringBuilder.length() == 0;
            try {
                b(spannableStringBuilder, fdaVar, z2, rt2Var.A());
                spannableStringBuilder = spannableStringBuilder;
                c(i, rt2Var, fdaVar, spannableStringBuilder, z2);
                poeVar = sbi.a;
            } catch (Throwable th) {
                th = th;
                spannableStringBuilder = spannableStringBuilder;
                poeVar = new poe(th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(this.H, "FAILURE process last message for chatRow", thA);
            ((iv4) this.i.getValue()).a("ONEME-16071", new IllegalStateException("FAILURE process last message for chatRow", thA));
        }
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gn9.class)) {
            spannableStringBuilder.removeSpan((gn9) obj);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final CharSequence h(long j) {
        l8b l8bVar;
        Map mapA = ((oc8) this.e.getValue()).a(j);
        if (mapA == null) {
            return null;
        }
        if (mapA.isEmpty()) {
            l8bVar = ki9.a;
        } else {
            l8b l8bVar2 = new l8b(mapA.size());
            for (Map.Entry entry : mapA.entrySet()) {
                l8bVar2.i(((Number) entry.getKey()).longValue(), entry.getValue());
            }
            l8bVar = l8bVar2;
        }
        if (l8bVar == null) {
            return null;
        }
        return (CharSequence) this.I.c(new a13(j, l8bVar));
    }
}
