/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa.tools;

/**
 *
 * @author nesas-12
 */
public class Encryptor {
    public enum TYPES {TRIPLEDES, RSA, AES};
    
    private TYPES type;
    private boolean cbc;
    private byte[] iv;
    private String publicKey;
    private String secret;

    public Encryptor type(TYPES type) {
        this.type = type;
        return this;
    }

    public Encryptor cbc(boolean cbc) {
        this.cbc = cbc;
        return this;
    }

    public Encryptor iv(byte[] iv) {
        this.iv = iv;
        return this;
    }

    public Encryptor publicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    public Encryptor secret(String secret) {
        this.secret = secret;
        return this;
    }
    

    public String encrypt(String plain){
        return "encryped text";
    }
    public String decrypt(String encryptedText){
        return "plain text";
    }
}
