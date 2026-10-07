package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class huc implements Externalizable {
    public boolean d;
    public boolean g;
    public String a = "";
    public String b = "";
    public final ArrayList c = new ArrayList();
    public String e = "";
    public boolean f = false;
    public String h = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        this.a = objectInput.readUTF();
        this.b = objectInput.readUTF();
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.c.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.d = true;
            this.e = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.g = true;
            this.h = utf2;
        }
        this.f = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.a);
        objectOutput.writeUTF(this.b);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeUTF((String) arrayList.get(i));
        }
        objectOutput.writeBoolean(this.d);
        if (this.d) {
            objectOutput.writeUTF(this.e);
        }
        objectOutput.writeBoolean(this.g);
        if (this.g) {
            objectOutput.writeUTF(this.h);
        }
        objectOutput.writeBoolean(this.f);
    }
}
