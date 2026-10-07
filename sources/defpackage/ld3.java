package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ld3 extends mdh implements qf7 {
    public Long e;
    public int f;
    public final /* synthetic */ xd3 g;
    public final /* synthetic */ g4b h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ Long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld3(xd3 xd3Var, g4b g4bVar, int i, Long l, long j, Long l2, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = xd3Var;
        this.h = g4bVar;
        this.i = i;
        this.j = l;
        this.k = j;
        this.l = l2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new ld3(this.g, this.h, this.i, this.j, this.k, this.l, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((ld3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Long l;
        String str;
        int i = this.f;
        sbi sbiVar = sbi.a;
        g4b g4bVar = this.h;
        xd3 xd3Var = this.g;
        if (i == 0) {
            ch3.d0(obj);
            rt2 rt2Var = (rt2) xd3Var.G1.a.getValue();
            l = rt2Var != null ? new Long(rt2Var.a) : null;
            if (l == null) {
                xd3Var.I().B(f4b.EMPTY_CHAT, g4bVar);
                return sbiVar;
            }
            int i2 = this.i;
            if (i2 != 0) {
                ae9 ae9Var = (ae9) xd3Var.J.getValue();
                switch (i2) {
                    case 1:
                        str = "first_message";
                        break;
                    case 2:
                        str = "stickerset";
                        break;
                    case 3:
                        str = "showcase";
                        break;
                    case 4:
                        str = "recent";
                        break;
                    case 5:
                        str = "popular";
                        break;
                    case 6:
                        str = "favorite";
                        break;
                    case 7:
                        str = "added_stickersets";
                        break;
                    case 8:
                        str = "showcase_webapp";
                        break;
                    case 9:
                        str = "suggest";
                        break;
                    default:
                        throw null;
                }
                ae9.k(ae9Var, "sticker", "send_sticker", ouk.a(new ylc("screen", str)), 8);
            }
            dpa dpaVar = (dpa) xd3Var.C.getValue();
            long jLongValue = l.longValue();
            this.e = l;
            this.f = 1;
            obj = dpaVar.a(jLongValue, this.j, this);
            hu4 hu4Var = hu4.a;
            if (obj == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l = this.e;
            ch3.d0(obj);
        }
        vkf vkfVar = new vkf(1, l.longValue(), this.k);
        vkfVar.b = (eia) obj;
        vkfVar.g = g4bVar;
        Long l2 = this.l;
        if (l2 != null) {
            vkfVar.f = new ng5(l2.longValue(), true);
        }
        xd3.D(xd3Var).c(new wkf(vkfVar, (byte) 0));
        return sbiVar;
    }
}
