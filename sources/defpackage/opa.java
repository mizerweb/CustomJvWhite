package defpackage;

import java.util.ArrayList;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class opa implements rpa {
    public static final opa d = new opa(r66.a, true, true);
    public final List a;
    public final boolean b;
    public final boolean c;

    public opa(List list, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public static String a(MessageModel messageModel) {
        if (messageModel == null) {
            return "null";
        }
        long j = messageModel.a;
        long j2 = messageModel.b;
        long j3 = messageModel.c;
        StringBuilder sbS = qt4.s(j, "MessageModel(messageId=", ", serverId=");
        sbS.append(j2);
        return zo5.k(j3, ", sortTime=", ")", sbS);
    }

    @Override // defpackage.rpa
    public final List b() {
        return this.a;
    }

    public final ArrayList c() {
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((MessageModel) obj).g == f9j.Error) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opa)) {
            return false;
        }
        opa opaVar = (opa) obj;
        return cqk.d(this.a, opaVar.a) && this.b == opaVar.b && this.c == opaVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nbh.n(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        List list = this.a;
        int size = list.size();
        String strA = a((MessageModel) ww3.t1(list));
        String strA2 = a((MessageModel) ww3.D1(list));
        StringBuilder sbB = zo5.B("\n        MessagesList(\n            hasNext=", this.b, ",\n            hasPrev=", this.c, ",\n            messages=Messages(size=");
        sbB.append(size);
        sbB.append(", first=");
        sbB.append(strA);
        sbB.append(", last=");
        sbB.append(strA2);
        sbB.append(")\n        ) \n        ");
        return s5h.x0(sbB.toString());
    }
}
