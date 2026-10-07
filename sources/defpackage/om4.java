package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public abstract class om4 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static pm4 a(byte[] bArr) throws ProtoException {
        int i;
        try {
            Tasks.ContactUpdate contactUpdate = (Tasks.ContactUpdate) sia.mergeFrom(new Tasks.ContactUpdate(), bArr);
            long j = contactUpdate.requestId;
            long j2 = contactUpdate.contactId;
            String str = contactUpdate.action;
            str.getClass();
            int i2 = 6;
            switch (str) {
                case "REMOVE":
                    i = 3;
                    return new pm4(i, j, j2, contactUpdate.oldName, contactUpdate.oldLastName, contactUpdate.newName, contactUpdate.lastName);
                case "UPDATE":
                    i = 5;
                    return new pm4(i, j, j2, contactUpdate.oldName, contactUpdate.oldLastName, contactUpdate.newName, contactUpdate.lastName);
                case "HIDE_STORIES":
                    i = i2;
                    return new pm4(i, j, j2, contactUpdate.oldName, contactUpdate.oldLastName, contactUpdate.newName, contactUpdate.lastName);
                case "ADD":
                    i = 4;
                    return new pm4(i, j, j2, contactUpdate.oldName, contactUpdate.oldLastName, contactUpdate.newName, contactUpdate.lastName);
                case "BLOCK":
                    i = 1;
                    return new pm4(i, j, j2, contactUpdate.oldName, contactUpdate.oldLastName, contactUpdate.newName, contactUpdate.lastName);
                case "UNBLOCK":
                    i = 2;
                    return new pm4(i, j, j2, contactUpdate.oldName, contactUpdate.oldLastName, contactUpdate.newName, contactUpdate.lastName);
                case "SHOW_STORIES":
                    i2 = 7;
                    i = i2;
                    return new pm4(i, j, j2, contactUpdate.oldName, contactUpdate.oldLastName, contactUpdate.newName, contactUpdate.lastName);
                default:
                    ore.p(c0a.o("No such value ", str, " for ContactUpdateAction"));
                    return null;
            }
        } catch (InvalidProtocolBufferNanoException e) {
            qr7.t(e);
            return null;
        }
    }
}
