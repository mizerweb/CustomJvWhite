package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class p32 {
    public final Context a;
    public final ny8 b;
    public final ny8 c;

    public p32(ny8 ny8Var, ny8 ny8Var2, Context context) {
        this.a = context;
        this.b = ny8Var2;
        this.c = ny8Var;
    }

    public static String e(Long l) {
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        long j = jLongValue / 3600;
        long j2 = (jLongValue % 3600) / 60;
        long j3 = jLongValue % 60;
        return j > 0 ? String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}, 3)) : String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3)}, 2));
    }

    public final xnh a(tnh tnhVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tnhVar.b(this.a));
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 18);
        return new xnh(spannableStringBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final mh1 b(paj pajVar) {
        Drawable drawableE;
        kh1 kh1Var = (kh1) pajVar;
        boolean zEquals = kh1Var.equals(xg1.c);
        a8g a8gVar = pq3.j;
        Context context = this.a;
        if (zEquals) {
            drawableE = o7j.e(R.drawable.icon_status_delivered, a8gVar.k(context).b.getIcon().b, context);
        } else if (kh1Var.equals(yg1.c)) {
            drawableE = i();
        } else if (kh1Var.equals(ah1.c)) {
            drawableE = o7j.e(R.drawable.ic_connection_fill_16, a8gVar.k(context).b.getIcon().j, context);
        } else {
            if (!kh1Var.equals(gh1.c)) {
                return null;
            }
            drawableE = o7j.e(R.drawable.icon_microphone_crossed_fill, a8gVar.k(context).b.getIcon().b, context);
        }
        Drawable drawable = drawableE;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qv1.k("  ", context.getString(pajVar.a)));
        spannableStringBuilder.setSpan(new FitFontImageSpan(drawable, null, false, false, 14, null), 0, 1, 17);
        return new mh1(kh1Var.getPriority(), spannableStringBuilder);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(boolean z, nq4 nq4Var) {
        n32 n32Var;
        Integer num;
        if (nq4Var instanceof n32) {
            n32Var = (n32) nq4Var;
            int i = n32Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                n32Var.g = i - Integer.MIN_VALUE;
            } else {
                n32Var = new n32(this, nq4Var);
            }
        } else {
            n32Var = new n32(this, nq4Var);
        }
        Object objH = n32Var.e;
        int i2 = n32Var.g;
        if (i2 == 0) {
            ch3.d0(objH);
            n32Var.d = z;
            n32Var.g = 1;
            objH = h(n32Var);
            Object obj = hu4.a;
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = n32Var.d;
            ch3.d0(objH);
        }
        String str = (String) objH;
        Context context = this.a;
        if (str != null) {
            num = z ? new Integer(R.string.call_incoming_video_call_for) : null;
            return context.getString(num != null ? num.intValue() : R.string.call_incoming_audio_call_for, str);
        }
        num = z ? new Integer(R.string.call_incoming_video_call) : null;
        return context.getString(num != null ? num.intValue() : R.string.call_incoming_audio_call);
    }

    public final SpannableStringBuilder d(CharSequence charSequence, boolean z, int i, boolean z2, boolean z3, boolean z4, pi6 pi6Var) {
        Drawable mbgVar = null;
        if (charSequence == null) {
            return null;
        }
        if (z && (((pi6Var instanceof ji6) || (pi6Var instanceof li6) || (pi6Var instanceof ni6)) && z3)) {
            mbgVar = i();
        } else if (z || !z2 || (pi6Var instanceof ji6) || (pi6Var instanceof li6) || (pi6Var instanceof ni6)) {
            a8g a8gVar = pq3.j;
            Context context = this.a;
            if (!z && z4) {
                mbgVar = o7j.e(R.drawable.icon_share_screen_fill, a8gVar.k(context).b.getIcon().b, context);
                mbgVar.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
            } else if (i == 2) {
                mbgVar = o7j.e(R.drawable.icon_microphone_crossed_fill, a8gVar.k(context).b.getIcon().b, context);
                mbgVar.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
            } else if (i == 1) {
                mbgVar = new mbg(context, a8gVar.e(context).m(), new xk1(14));
                mbgVar.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
            }
        } else {
            mbgVar = i();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (mbgVar != null) {
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new FitFontImageSpan(mbgVar, null, false, false, 14, null), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        }
        return spannableStringBuilder;
    }

    public final String f(boolean z, boolean z2, boolean z3, boolean z4, pi6 pi6Var) {
        Context context = this.a;
        if (!z3 && !z2 && !z && (z4 || (pi6Var instanceof ji6) || (pi6Var instanceof li6))) {
            return context.getString(R.string.call_connecting);
        }
        if (!z3 && !z2 && (pi6Var instanceof ni6) && !z) {
            return context.getString(R.string.call_waiting);
        }
        if (((pi6Var instanceof ji6) || (pi6Var instanceof li6) || (pi6Var instanceof ni6)) && !z3) {
            return context.getString(R.string.call_connecting);
        }
        if (!(pi6Var instanceof hi6)) {
            return null;
        }
        switch (((hi6) pi6Var).a.ordinal()) {
            case 0:
                return context.getString(R.string.call_opponent_unavailable_missed);
            case 1:
                return context.getString(R.string.call_opponent_unavailable_busy);
            case 2:
                return context.getString(R.string.call_opponent_unavailable_privacy);
            case 3:
            case 14:
                return context.getString(R.string.call_failed);
            case 4:
                return context.getString(R.string.call_opponent_failed_timout);
            case 5:
                return context.getString(R.string.opponent_no_network);
            case 6:
                return context.getString(R.string.call_group_was_removed_from_call);
            case 7:
                return context.getString(R.string.call_group_was_removed_from_waiting_room);
            case 8:
                return context.getString(R.string.call_group_user_not_in_chat);
            case 9:
                return context.getString(R.string.call_group_wait_admin);
            case 10:
                return context.getString(R.string.call_user_restricted_info);
            case 11:
                return context.getString(R.string.call_participants_limit_reached);
            case 12:
                return context.getString(R.string.call_opponent_reject_call);
            case 13:
                return context.getString(R.string.call_start_group_call_unavailable);
            case 15:
                return context.getString(R.string.call_max_connect_failed_subtitle);
            case 16:
                return context.getString(R.string.call_ios_restriction_subtitle);
            default:
                ore.o();
                return null;
        }
    }

    public final SpannableStringBuilder g(boolean z, int i, CharSequence charSequence, boolean z2, boolean z3, boolean z4, boolean z5, pi6 pi6Var, boolean z6) {
        CharSequence string;
        Context context = this.a;
        if (!z && z5) {
            string = context.getString(R.string.call_main_speaker_share_screen, charSequence != null ? (String) ww3.t1(r5h.l1(charSequence, new char[]{' '})) : null);
        } else if (z2 || z) {
            string = z ? context.getString(R.string.call_me_member) : charSequence;
        } else {
            string = null;
        }
        if (!z6) {
            return d(string, z, i, z3, z4, z5, pi6Var);
        }
        if (string != null) {
            return new SpannableStringBuilder(string).append((CharSequence) " ").append((CharSequence) context.getString(R.string.call_user_on_hold_suffix));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(nq4 nq4Var) {
        o32 o32Var;
        Object poeVar;
        if (nq4Var instanceof o32) {
            o32Var = (o32) nq4Var;
            int i = o32Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                o32Var.f = i - Integer.MIN_VALUE;
            } else {
                o32Var = new o32(this, nq4Var);
            }
        } else {
            o32Var = new o32(this, nq4Var);
        }
        Object objB = o32Var.d;
        int i2 = o32Var.f;
        try {
            if (i2 == 0) {
                ch3.d0(objB);
                if (!((y6b) this.c.getValue()).d()) {
                    return null;
                }
                utd utdVar = (utd) this.b.getValue();
                o32Var.f = 1;
                objB = utdVar.b(((s7f) ((et3) utdVar.e.getValue())).t(), o32Var);
                hu4 hu4Var = hu4.a;
                if (objB == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objB);
            }
            poeVar = ((vjd) objB).d.k();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        String str = (String) poeVar;
        if (str == null || r5h.X0(str)) {
            return null;
        }
        return str;
    }

    public final da9 i() {
        a8g a8gVar = pq3.j;
        Context context = this.a;
        a8gVar.k(context);
        da9 da9Var = new da9(context, -1);
        da9Var.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        return da9Var;
    }
}
