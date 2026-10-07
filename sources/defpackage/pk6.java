package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;
import one.me.chats.list.ChatsListWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class pk6 extends g6g {
    public final /* synthetic */ int f;
    public final Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pk6(Object obj, ExecutorService executorService, int i) {
        super(executorService);
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.g6g
    /* JADX INFO: renamed from: K */
    public void u(s7g s7gVar, int i) {
        switch (this.f) {
            case 0:
                Object obj = this.g;
                ChatsListWidget chatsListWidget = (ChatsListWidget) obj;
                int f = ((lk6) ((k79) F(i))).getF();
                d20 d20Var = this.d;
                if (f == R.id.fake_chat_contact_item_view_type) {
                    jk6 jk6Var = (jk6) s7gVar;
                    final lk6 lk6Var = (lk6) d20Var.f.get(i);
                    final n61 n61Var = new n61(1, (ChatsListWidget) obj, ok6.class, "onFakeChatItemClick", "onFakeChatItemClick(J)V", 0, 21);
                    m20 m20Var = new m20(2, (ChatsListWidget) obj, ok6.class, "onFakeChatItemLongTap", "onFakeChatItemLongTap(JLandroid/view/View;)V", 0, 18);
                    final n61 n61Var2 = new n61(1, (ChatsListWidget) obj, ok6.class, "onFakeChatItemButtonClick", "onFakeChatItemButtonClick(J)V", 0, 22);
                    jk6Var.B(lk6Var);
                    xu2 xu2Var = (xu2) jk6Var.a;
                    qe7.H(xu2Var, 300L, new View.OnClickListener() { // from class: ik6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            lk6 lk6Var2 = lk6Var;
                            boolean z = lk6Var2.g;
                            long j = lk6Var2.a;
                            if (z) {
                                n61Var.invoke(Long.valueOf(j));
                            } else {
                                n61Var2.invoke(Long.valueOf(j));
                            }
                        }
                    });
                    xu2Var.setOnLongClickListener(new rg3(m20Var, lk6Var, jk6Var, 2));
                } else if (f == R.id.fake_chat_phone_item_view_type) {
                    nk6 nk6Var = (nk6) s7gVar;
                    lk6 lk6Var2 = (lk6) d20Var.f.get(i);
                    n61 n61Var3 = new n61(chatsListWidget, 23);
                    m20 m20Var2 = new m20(chatsListWidget);
                    n61 n61Var4 = new n61(chatsListWidget, 24);
                    nk6Var.B(lk6Var2);
                    izb izbVar = (izb) nk6Var.a;
                    nk6Var.u = n61Var3;
                    nk6Var.v = n61Var4;
                    if (!lk6Var2.g) {
                        qe7.H(izbVar, 300L, new mk6(nk6Var, lk6Var2, 1));
                        ynh ynhVar = lk6Var2.f;
                        CharSequence charSequenceB = ynhVar != null ? ynhVar.b(izbVar.getContext()) : null;
                        if (charSequenceB == null) {
                            ore.p("Required value was null.");
                        } else {
                            izbVar.k(charSequenceB, new dx4(n61Var4, 9, lk6Var2));
                        }
                    } else {
                        qe7.H(izbVar, 300L, new mk6(nk6Var, lk6Var2, 0));
                        izbVar.i();
                    }
                    izbVar.setOnLongClickListener(new o03(m20Var2, lk6Var2, nk6Var, 4));
                }
                break;
            case 1:
                N((ol8) s7gVar, i);
                break;
            default:
                super.u(s7gVar, i);
                break;
        }
    }

    public void N(ol8 ol8Var, int i) {
        or0 or0Var = (or0) ((k79) F(i));
        dx4 dx4Var = new dx4(or0Var, 21, this);
        ol8Var.B(or0Var);
        qe7.H(ol8Var.a, 300L, new o37(11, dx4Var));
    }

    @Override // defpackage.g6g, defpackage.nee
    public int n(int i) {
        switch (this.f) {
            case 0:
                return ((lk6) ((k79) F(i))).getF();
            case 1:
                return R.id.oneme_invite_action_view_type;
            default:
                return super.n(i);
        }
    }

    @Override // defpackage.g6g, defpackage.nee
    public /* bridge */ /* synthetic */ void u(lfe lfeVar, int i) {
        switch (this.f) {
            case 0:
                u((s7g) lfeVar, i);
                break;
            case 1:
                N((ol8) lfeVar, i);
                break;
            default:
                super.u(lfeVar, i);
                break;
        }
    }

    @Override // defpackage.nee
    public void v(lfe lfeVar, int i, List list) {
        switch (this.f) {
            case 0:
                s7g s7gVar = (s7g) lfeVar;
                if (list.isEmpty()) {
                    u(s7gVar, i);
                } else {
                    kk6 kk6Var = new kk6(3);
                    for (Object obj : list) {
                        kk6 kk6Var2 = obj instanceof kk6 ? (kk6) obj : null;
                        if (kk6Var2 != null) {
                            kk6Var.e(kk6Var2);
                        }
                    }
                    s7gVar.C((k79) this.d.f.get(i), kk6Var);
                }
                break;
            case 1:
            default:
                super.v(lfeVar, i, list);
                break;
            case 2:
                vtg vtgVar = (vtg) lfeVar;
                if (list.isEmpty()) {
                    u(vtgVar, i);
                } else {
                    vtgVar.C((osg) ((k79) F(i)), list.get(0));
                }
                break;
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        switch (this.f) {
            case 0:
                if (i == R.id.fake_chat_contact_item_view_type) {
                    jk6 jk6Var = new jk6(new xu2(viewGroup.getContext()));
                    jk6Var.u = 0L;
                    return jk6Var;
                }
                if (i == R.id.fake_chat_phone_item_view_type) {
                    return new nk6(new izb(viewGroup.getContext()));
                }
                ore.p(c0a.k(i, "Unknown viewType '", "'"));
                return null;
            case 1:
                return new ol8(new nl8(viewGroup.getContext()));
            default:
                return new vtg((to3) this.g, viewGroup.getContext());
        }
    }
}
