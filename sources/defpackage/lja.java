package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes.dex */
public final class lja {
    public final ny8 a;
    public final ifh b;

    public lja(ny8 ny8Var, ei3 ei3Var) {
        this.a = ny8Var;
        this.b = new ifh(new ap9(2, ei3Var));
    }

    public final kja a(byte[] bArr) throws ProtoException {
        byte[] bArr2 = a.a;
        try {
            Protos.MessageReactions from = Protos.MessageReactions.parseFrom(bArr);
            ArrayList arrayList = new ArrayList();
            int length = from.reactions.length;
            for (int i = 0; i < length; i++) {
                Protos.ReactionData reactionData = from.reactions[i].reaction;
                arrayList.add(new jja(new z5e(a6e.a(reactionData.type), b(reactionData.reaction)), from.reactions[i].count));
            }
            int i2 = from.totalCount;
            Protos.ReactionData reactionData2 = from.yourReaction;
            return new kja(arrayList, i2, reactionData2 != null ? new z5e(a6e.a(reactionData2.type), b(from.yourReaction.reaction)) : null);
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }

    public final s5e b(String str) {
        return new s5e(((b56) this.a.getValue()).d(str));
    }

    public final s5e c(String str, int i, jl jlVar) {
        ny8 ny8Var = this.a;
        return new s5e((jlVar == null || !((Boolean) this.b.getValue()).booleanValue()) ? ((b56) ny8Var.getValue()).c(i, str) : ((b56) ny8Var.getValue()).b(jlVar.a, jlVar.c, jlVar.e, str, i));
    }

    public final kja d(hja hjaVar) {
        if (hjaVar == null) {
            return null;
        }
        List<eja> listA = hjaVar.a();
        ArrayList arrayList = new ArrayList(yw3.W0(listA, 10));
        for (eja ejaVar : listA) {
            arrayList.add(new jja(e(ejaVar.b()), ejaVar.a()));
        }
        int iB = hjaVar.b();
        dja djaVarC = hjaVar.c();
        return new kja(arrayList, iB, djaVarC != null ? e(djaVarC) : null);
    }

    public final z5e e(dja djaVar) {
        return new z5e(xml.d(djaVar.b().a()), b(djaVar.a()));
    }
}
