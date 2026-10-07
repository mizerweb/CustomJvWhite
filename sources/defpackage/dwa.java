package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.a;

/* JADX INFO: loaded from: classes.dex */
public final class dwa {
    public final ny8 a;

    public dwa(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public static c46 a(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            try {
                byte[] bArr2 = a.a;
                try {
                    return a.e(Protos.Attaches.parseFrom(bArr));
                } catch (InvalidProtocolBufferNanoException e) {
                    throw new ProtoException(e);
                }
            } catch (ProtoException e2) {
                qr7.o(e2);
            }
        }
        return null;
    }

    public static xfa b(int i) {
        Object next;
        Iterator it = xfa.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((xfa) next).a != i);
        xfa xfaVar = (xfa) next;
        if (xfaVar != null) {
            return xfaVar;
        }
        ore.p(c0a.k(i, "No such value ", " for MessageStatus"));
        return null;
    }

    public static List c(byte[] bArr) {
        try {
            Protos.MessageElements messageElements = new Protos.MessageElements();
            sia.mergeFrom(messageElements, bArr);
            return dga.a(messageElements.elements);
        } catch (InvalidProtocolBufferNanoException e) {
            gm0.V("MessagesTypeConverters", "InvalidProtocolBufferNanoException", new cwa(e));
            return r66.a;
        }
    }

    public static wja d(int i) {
        for (wja wjaVar : wja.values()) {
            if (wjaVar.a == i) {
                return wjaVar;
            }
        }
        ore.f("Array contains no element matching the predicate.");
        return null;
    }

    public static int e(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 10) {
            return 2;
        }
        if (i == 20) {
            return 3;
        }
        if (i != 30) {
            return i != 40 ? 2 : 5;
        }
        return 4;
    }

    public final kja f(byte[] bArr) {
        lja ljaVar = (lja) this.a.getValue();
        if (bArr != null && bArr.length > 0) {
            try {
                return ljaVar.a(bArr);
            } catch (ProtoException e) {
                qr7.o(e);
            }
        }
        return null;
    }
}
