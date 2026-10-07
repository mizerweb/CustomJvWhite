package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class juc implements Externalizable {
    public boolean A;
    public boolean C;
    public boolean E;
    public boolean G;
    public boolean X;
    public boolean Z;
    public boolean a;
    public boolean c;
    public boolean e;
    public boolean g;
    public boolean i;
    public boolean k;
    public boolean m;
    public boolean o;
    public boolean o1;
    public boolean q;
    public boolean q1;
    public boolean s;
    public boolean s1;
    public boolean u;
    public boolean w;
    public boolean y;
    public boolean y1;
    public kuc b = null;
    public kuc d = null;
    public kuc f = null;
    public kuc h = null;
    public kuc j = null;
    public kuc l = null;
    public kuc n = null;
    public kuc p = null;
    public kuc r = null;
    public kuc t = null;
    public kuc v = null;
    public kuc x = null;
    public kuc z = null;
    public kuc B = null;
    public kuc D = null;
    public kuc F = null;
    public kuc H = null;
    public String I = "";
    public int J = 0;
    public String K = "";
    public String Y = "";
    public String n1 = "";
    public String p1 = "";
    public String r1 = "";
    public String t1 = "";
    public boolean u1 = false;
    public final ArrayList v1 = new ArrayList();
    public final ArrayList w1 = new ArrayList();
    public boolean x1 = false;
    public String z1 = "";
    public boolean A1 = false;

    public void a(String str) {
        this.I = str;
    }

    public void b(String str) {
        this.K = str;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            kuc kucVar = new kuc();
            kucVar.readExternal(objectInput);
            this.a = true;
            this.b = kucVar;
        }
        if (objectInput.readBoolean()) {
            kuc kucVar2 = new kuc();
            kucVar2.readExternal(objectInput);
            this.c = true;
            this.d = kucVar2;
        }
        if (objectInput.readBoolean()) {
            kuc kucVar3 = new kuc();
            kucVar3.readExternal(objectInput);
            this.e = true;
            this.f = kucVar3;
        }
        if (objectInput.readBoolean()) {
            kuc kucVar4 = new kuc();
            kucVar4.readExternal(objectInput);
            this.g = true;
            this.h = kucVar4;
        }
        if (objectInput.readBoolean()) {
            kuc kucVar5 = new kuc();
            kucVar5.readExternal(objectInput);
            this.i = true;
            this.j = kucVar5;
        }
        if (objectInput.readBoolean()) {
            kuc kucVar6 = new kuc();
            kucVar6.readExternal(objectInput);
            this.k = true;
            this.l = kucVar6;
        }
        if (objectInput.readBoolean()) {
            kuc kucVar7 = new kuc();
            kucVar7.readExternal(objectInput);
            this.m = true;
            this.n = kucVar7;
        }
        if (objectInput.readBoolean()) {
            kuc kucVar8 = new kuc();
            kucVar8.readExternal(objectInput);
            this.o = true;
            this.p = kucVar8;
        }
        if (objectInput.readBoolean()) {
            kuc kucVar9 = new kuc();
            kucVar9.readExternal(objectInput);
            this.q = true;
            this.r = kucVar9;
        }
        if (objectInput.readBoolean()) {
            kuc kucVar10 = new kuc();
            kucVar10.readExternal(objectInput);
            this.s = true;
            this.t = kucVar10;
        }
        if (objectInput.readBoolean()) {
            kuc kucVar11 = new kuc();
            kucVar11.readExternal(objectInput);
            this.u = true;
            this.v = kucVar11;
        }
        if (objectInput.readBoolean()) {
            kuc kucVar12 = new kuc();
            kucVar12.readExternal(objectInput);
            this.w = true;
            this.x = kucVar12;
        }
        if (objectInput.readBoolean()) {
            kuc kucVar13 = new kuc();
            kucVar13.readExternal(objectInput);
            this.y = true;
            this.z = kucVar13;
        }
        if (objectInput.readBoolean()) {
            kuc kucVar14 = new kuc();
            kucVar14.readExternal(objectInput);
            this.A = true;
            this.B = kucVar14;
        }
        if (objectInput.readBoolean()) {
            kuc kucVar15 = new kuc();
            kucVar15.readExternal(objectInput);
            this.C = true;
            this.D = kucVar15;
        }
        if (objectInput.readBoolean()) {
            kuc kucVar16 = new kuc();
            kucVar16.readExternal(objectInput);
            this.E = true;
            this.F = kucVar16;
        }
        if (objectInput.readBoolean()) {
            kuc kucVar17 = new kuc();
            kucVar17.readExternal(objectInput);
            this.G = true;
            this.H = kucVar17;
        }
        a(objectInput.readUTF());
        this.J = objectInput.readInt();
        b(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.X = true;
            this.Y = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.Z = true;
            this.n1 = utf2;
        }
        if (objectInput.readBoolean()) {
            String utf3 = objectInput.readUTF();
            this.o1 = true;
            this.p1 = utf3;
        }
        if (objectInput.readBoolean()) {
            String utf4 = objectInput.readUTF();
            this.q1 = true;
            this.r1 = utf4;
        }
        if (objectInput.readBoolean()) {
            String utf5 = objectInput.readUTF();
            this.s1 = true;
            this.t1 = utf5;
        }
        this.u1 = objectInput.readBoolean();
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            huc hucVar = new huc();
            hucVar.readExternal(objectInput);
            this.v1.add(hucVar);
        }
        int i3 = objectInput.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            huc hucVar2 = new huc();
            hucVar2.readExternal(objectInput);
            this.w1.add(hucVar2);
        }
        this.x1 = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String utf6 = objectInput.readUTF();
            this.y1 = true;
            this.z1 = utf6;
        }
        this.A1 = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.a);
        if (this.a) {
            this.b.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.c);
        if (this.c) {
            this.d.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.e);
        if (this.e) {
            this.f.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.g);
        if (this.g) {
            this.h.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.i);
        if (this.i) {
            this.j.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.k);
        if (this.k) {
            this.l.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.m);
        if (this.m) {
            this.n.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.o);
        if (this.o) {
            this.p.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.q);
        if (this.q) {
            this.r.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.s);
        if (this.s) {
            this.t.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.u);
        if (this.u) {
            this.v.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.w);
        if (this.w) {
            this.x.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.y);
        if (this.y) {
            this.z.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A);
        if (this.A) {
            this.B.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.C);
        if (this.C) {
            this.D.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.E);
        if (this.E) {
            this.F.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.G);
        if (this.G) {
            this.H.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.I);
        objectOutput.writeInt(this.J);
        objectOutput.writeUTF(this.K);
        objectOutput.writeBoolean(this.X);
        if (this.X) {
            objectOutput.writeUTF(this.Y);
        }
        objectOutput.writeBoolean(this.Z);
        if (this.Z) {
            objectOutput.writeUTF(this.n1);
        }
        objectOutput.writeBoolean(this.o1);
        if (this.o1) {
            objectOutput.writeUTF(this.p1);
        }
        objectOutput.writeBoolean(this.q1);
        if (this.q1) {
            objectOutput.writeUTF(this.r1);
        }
        objectOutput.writeBoolean(this.s1);
        if (this.s1) {
            objectOutput.writeUTF(this.t1);
        }
        objectOutput.writeBoolean(this.u1);
        ArrayList arrayList = this.v1;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((huc) arrayList.get(i)).writeExternal(objectOutput);
        }
        ArrayList arrayList2 = this.w1;
        int size2 = arrayList2.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((huc) arrayList2.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.x1);
        objectOutput.writeBoolean(this.y1);
        if (this.y1) {
            objectOutput.writeUTF(this.z1);
        }
        objectOutput.writeBoolean(this.A1);
    }
}
