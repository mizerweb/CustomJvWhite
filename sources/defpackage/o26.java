package defpackage;

import java.io.Serializable;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class o26 extends mdh implements wf7 {
    public /* synthetic */ float e;
    public /* synthetic */ float f;
    public /* synthetic */ n16 g;
    public /* synthetic */ f16 h;
    public final /* synthetic */ p26 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o26(p26 p26Var, lq4 lq4Var) {
        super(5, lq4Var);
        this.i = p26Var;
    }

    @Override // defpackage.wf7
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        float fFloatValue = ((Number) obj).floatValue();
        float fFloatValue2 = ((Number) obj2).floatValue();
        o26 o26Var = new o26(this.i, (lq4) serializable);
        o26Var.e = fFloatValue;
        o26Var.f = fFloatValue2;
        o26Var.g = (n16) obj3;
        o26Var.h = (f16) obj4;
        return o26Var.invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        float f = this.e;
        float f2 = this.f;
        n16 n16Var = this.g;
        f16 f16Var = this.h;
        ch3.d0(obj);
        e16 e16Var = f16Var instanceof e16 ? (e16) f16Var : null;
        kb9 kb9Var = e16Var != null ? e16Var.a : null;
        if (kb9Var != null && kb9Var.l == jb9.d && (n16Var instanceof k16)) {
            Long l = kb9Var.g;
            float fLongValue = l != null ? l.longValue() : 0L;
            long jAbs = (long) Math.abs((fLongValue * f2) - (f * fLongValue));
            p26 p26Var = this.i;
            if (jAbs > p26Var.K()) {
                ghb ghbVar = ew5.b;
                return new p16(new vnh(R.string.oneme_stories_choose_video_trim_tooltip, a.n1(new Object[]{new Long(ew5.s(qe7.P(p26Var.K(), lw5.MILLISECONDS), lw5.MINUTES))})));
            }
        }
        return o16.a;
    }
}
