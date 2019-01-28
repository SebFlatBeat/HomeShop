package com.cursan.homeshop;

public interface Writer {
    /**
     *Start Writing process
     */
    public void start();

    /**
     * Write on line
     * @param: line
     */
    public void writeLine (String line);

    /**
     * Stop writing process
     */
    public void stop();
};
