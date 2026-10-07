package defpackage;

import android.content.ActivityNotFoundException;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class qf3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ChatTitleIconScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qf3(lq4 lq4Var, ChatTitleIconScreen chatTitleIconScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = chatTitleIconScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ChatTitleIconScreen chatTitleIconScreen = this.g;
        switch (i) {
            case 0:
                qf3 qf3Var = new qf3(lq4Var, chatTitleIconScreen, 0);
                qf3Var.f = obj;
                return qf3Var;
            case 1:
                qf3 qf3Var2 = new qf3(lq4Var, chatTitleIconScreen, 1);
                qf3Var2.f = obj;
                return qf3Var2;
            default:
                qf3 qf3Var3 = new qf3(chatTitleIconScreen, lq4Var);
                qf3Var3.f = obj;
                return qf3Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((qf3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((qf3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((qf3) create((sf3) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        String str = null;
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                tf3 tf3Var = (tf3) obj2;
                String str2 = tf3Var.b;
                String str3 = tf3Var.a;
                if (str2 != null && !r5h.X0(str2)) {
                    str = tf3Var.b;
                } else if (str3 != null && !r5h.X0(str3)) {
                    str = str3;
                }
                kwb kwbVarO1 = ChatTitleIconScreen.o1(this.g);
                kwbVarO1.setAvatarUrl(str);
                kwbVarO1.setCloseBadgeVisibility(!(str == null || str.length() == 0));
                break;
            case 1:
                Object obj3 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj3;
                if (rbbVar instanceof gf3) {
                    ml9.b(this.g);
                    gf3 gf3Var = (gf3) rbbVar;
                    c1a.b.j(gf3Var.b, gf3Var.c, false);
                } else if (rbbVar instanceof kf3) {
                    ml9.b(this.g);
                    try {
                        this.g.startActivityForResult(((kf3) rbbVar).b, 777);
                        tbb.g((tbb) this.g.i.getValue(), y3f.AVATAR_PICKER_CAMERA);
                    } catch (ActivityNotFoundException unused) {
                        ChatTitleIconScreen chatTitleIconScreen = this.g;
                        zv8[] zv8VarArr = ChatTitleIconScreen.q;
                        wf3 wf3VarS1 = chatTitleIconScreen.s1();
                        wf3VarS1.x = null;
                        h8c h8cVar = (h8c) wf3VarS1.l.getValue();
                        h8cVar.m(new tnh(R.string.cant_open_camera));
                        h8cVar.h(new w8c(R.drawable.icon_warning));
                        h8cVar.p();
                        String name = ChatTitleIconScreen.class.getName();
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            a4c.f(a4cVar, je9.g, name, "failed open camera", null, null, 8);
                        }
                    }
                    break;
                } else if (rbbVar instanceof jf3) {
                    ChatTitleIconScreen chatTitleIconScreen2 = this.g;
                    zv8[] zv8VarArr2 = ChatTitleIconScreen.q;
                    chatTitleIconScreen2.q1().setLoading(false);
                    ohg.b.l(new rf3(this.g, rbbVar, 0));
                } else if (rbbVar instanceof if3) {
                    ChatTitleIconScreen chatTitleIconScreen3 = this.g;
                    zv8[] zv8VarArr3 = ChatTitleIconScreen.q;
                    chatTitleIconScreen3.q1().setLoading(false);
                    ohg.b.l(new rf3(this.g, rbbVar, 1));
                } else if (rbbVar instanceof hf3) {
                    ChatTitleIconScreen chatTitleIconScreen4 = this.g;
                    zv8[] zv8VarArr4 = ChatTitleIconScreen.q;
                    chatTitleIconScreen4.q1().setLoading(false);
                    ohg.b.l(new rf3(this.g, rbbVar, 2));
                } else if (cqk.d(rbbVar, lf3.b)) {
                    ChatTitleIconScreen chatTitleIconScreen5 = this.g;
                    zv8[] zv8VarArr5 = ChatTitleIconScreen.q;
                    wsc wscVar = (wsc) chatTitleIconScreen5.h.getValue();
                    svj svjVar = new svj(this.g, 1);
                    wscVar.getClass();
                    wsc.h(wscVar, svjVar, wsc.n, 158, false, R.string.permissions_camera_request_photo, R.string.permissions_allow_access, null, new iua(19, svjVar), 64);
                }
                break;
            default:
                ChatTitleIconScreen chatTitleIconScreen6 = this.g;
                sf3 sf3Var = (sf3) this.f;
                ch3.d0(obj);
                if (cqk.d(sf3Var, sf3.a)) {
                    zv8[] zv8VarArr6 = ChatTitleIconScreen.q;
                    chatTitleIconScreen6.q1().setLoading(false);
                    h8c h8cVar2 = new h8c(chatTitleIconScreen6);
                    h8cVar2.m(new tnh(R.string.oneme_startconversation_channel_create_error));
                    h8cVar2.p();
                }
                break;
        }
        return sbi.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf3(ChatTitleIconScreen chatTitleIconScreen, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 2;
        this.g = chatTitleIconScreen;
    }
}
