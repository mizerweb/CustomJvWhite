package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class yva extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ bwa g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yva(bwa bwaVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = bwaVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        bwa bwaVar = this.g;
        switch (i) {
            case 0:
                yva yvaVar = new yva(bwaVar, lq4Var, 0);
                yvaVar.f = obj;
                return yvaVar;
            default:
                yva yvaVar2 = new yva(bwaVar, lq4Var, 1);
                yvaVar2.f = obj;
                return yvaVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((yva) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((yva) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                gu4 gu4Var = (gu4) this.f;
                ch3.d0(obj);
                List list = (List) this.g.o.getValue();
                String name = gu4Var.getClass().getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, c0a.o("Warmup reactions. defaultReactions = ", ww3.z1(list, ",", "[", "]", dz7.i, 24), "]"), null);
                    }
                }
                break;
            default:
                gu4 gu4Var2 = (gu4) this.f;
                ch3.d0(obj);
                bwa bwaVar = this.g;
                c79 c79VarW = yab.w();
                c79VarW.add(new kva(4, new tnh(R.string.oneme_messages_settings_send_by_enter_action_title), 0, R.id.oneme_messages_settings_send_by_enter, null, null, new ksf(bwaVar.c.d.getBoolean("app.messages.send.by.enter", false), true), 112));
                c79VarW.add(new kva(4, new tnh(R.string.oneme_messages_settings_stickers_settings_action_title), 1, R.id.oneme_messages_settings_stickers, new bz8(R.drawable.icon_sticker, 0, 6), null, fsf.a, 96));
                nni nniVar = bwaVar.c;
                String string = nniVar.d.getString("app.messages.double.tap.reaction", "👍");
                String str = r5h.X0(string) ? "👍" : string;
                jl jlVarG = ((xm) bwaVar.e.getValue()).g(str);
                Drawable drawableC = ((f66) bwaVar.k.getValue()).c(str);
                if (jlVarG != null) {
                    drawableC = ((dm) bwaVar.j.getValue()).a(jlVarG.a, jlVarG.c, jlVarG.e, drawableC, gm0.K(24.0f * yl5.d().getDisplayMetrics().density), 2);
                }
                Drawable drawable = drawableC;
                boolean z = nniVar.d.getBoolean("app.messages.enable.double.tap.reactions", true);
                c79VarW.add(new kva(z ? 1 : 4, new tnh(R.string.messages_settings_double_tap_reactions), 2, R.id.oneme_messages_settings_fast_reaction_enable, new bz8(R.drawable.icon_flame, 0, 6), new tnh(R.string.messages_settings_double_tap_reactions_desc), new ksf(z, true), 32));
                if (z) {
                    c79VarW.add(new jva(new tnh(R.string.oneme_messages_settings_fast_reaction_settings_action_title), R.id.oneme_messages_settings_fast_reaction_choose, drawable));
                }
                c79 c79VarJ = yab.j(c79VarW);
                this.g.l.setValue(c79VarJ);
                String name2 = gu4Var2.getClass().getName();
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, name2, zo5.h(c79VarJ.getSize(), "process sections. finish, size:"), null);
                    }
                }
                break;
        }
        return sbi.a;
    }
}
