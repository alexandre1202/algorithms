package br.com.aab.datastructures.linkedlist;

import java.util.Objects;

public class Customer implements Comparable<Customer> {

  private int id;
  private String name;

  public Customer(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return id == customer.id &&
        Objects.equals(name, customer.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public int compareTo(Customer o) {
    return Integer.compare(this.id, o.getId());
  }

  @Override
  public String toString() {
    return "Customer{" +
        "name='" + name + '\'' +
        '}';
  }
}
