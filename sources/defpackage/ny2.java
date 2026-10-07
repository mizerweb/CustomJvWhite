package defpackage;

import java.util.function.LongFunction;
import ru.ok.tamtam.messages.ChatException;
import ru.ok.tamtam.messages.a;

/* JADX INFO: loaded from: classes.dex */
public final class ny2 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;

    public ny2(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
    }

    public final rt2 a(long j, long j2, nx2 nx2Var, fda fdaVar, fda fdaVar2, fda fdaVar3, LongFunction longFunction) {
        if (fdaVar != null) {
            sfa sfaVar = fdaVar.a;
            if (sfaVar.h != j) {
                ((zed) this.c.getValue()).a.E(true);
                gm0.V(ny2.class.getName(), "wrong last message: id=" + j + ", data.lastMessageId=" + (nx2Var != null ? Long.valueOf(nx2Var.j) : null) + ", lastMessage=" + sfaVar, new ChatException.WrongLastMessage(j, sfaVar));
            }
        }
        return new rt2((jzb) this.f.getValue(), (ef3) this.a.getValue(), j, j2, nx2Var, fdaVar, fdaVar2, fdaVar3, longFunction);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
    public final rt2 b(ox2 ox2Var, sfa sfaVar) {
        sfa sfaVarL;
        fda fdaVarA;
        sfa sfaVarL2;
        long j = ox2Var.a;
        nx2 nx2Var = ox2Var.b;
        long j2 = nx2Var.j;
        long j3 = nx2Var.M;
        long j4 = nx2Var.h0;
        ny8 ny8Var = this.d;
        fda fdaVarA2 = null;
        if (j2 > 0) {
            sfaVarL = (sfaVar == null || sfaVar.a != j2) ? ((qfa) ny8Var.getValue()).l(j2) : sfaVar;
        } else {
            sfaVarL = null;
        }
        ny8 ny8Var2 = this.c;
        if (sfaVar != null && sfaVar.h != j) {
            ((zed) ny8Var2.getValue()).a.E(true);
            long j5 = nx2Var.j;
            StringBuilder sbS = qt4.s(j, "wrong last message: chatDb.id=", ", chatDb.lastMessageId=");
            sbS.append(j5);
            sbS.append(", messageDb=");
            sbS.append(sfaVarL);
            sbS.append(",lastMessage=");
            sbS.append(sfaVar);
            gm0.V(ny2.class.getName(), sbS.toString(), new ChatException.WrongLastMessage(j, sfaVar));
        }
        ny8 ny8Var3 = this.e;
        fda fdaVarA3 = sfaVarL != null ? a.a((a) ny8Var3.getValue(), sfaVarL) : null;
        if (!nx2Var.f()) {
            fdaVarA = null;
        } else if (fdaVarA3 == null || fdaVarA3.a.b != j4) {
            sfa sfaVarF = ((qfa) ny8Var.getValue()).f(j, j4);
            if (sfaVarF != null) {
                fdaVarA = a.a((a) ny8Var3.getValue(), sfaVarF);
            } else {
                fdaVarA = null;
            }
        } else {
            fdaVarA = fdaVarA3;
        }
        if (j3 > 0 && (sfaVarL2 = ((qfa) ny8Var.getValue()).l(j3)) != null) {
            fdaVarA2 = a.a((a) ny8Var3.getValue(), sfaVarL2);
        }
        return a(ox2Var.a, ((zed) ny8Var2.getValue()).a.t(), ox2Var.b, fdaVarA3, fdaVarA, fdaVarA2, new cw2(2, this));
    }
}
