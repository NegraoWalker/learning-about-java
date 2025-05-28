package conteudo3.composicao.exemplo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name; //nome
    private WorkerLevel workerLevel; //status do trabalhador
    private Double baseSalary; //salário base
    private Department department; // 1 Worker -> 1 Departamento
    private List<HourContract> contracts = new ArrayList<>(); // 1 Worker -> Vários HourContract

    public Worker() {
    }

    public Worker(String name, WorkerLevel workerLevel, Double baseSalary, Department department) {
        this.name = name;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(WorkerLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        for (HourContract hourContract : contracts) {
            LocalDate contractDate = hourContract.getDate();
            if (year == contractDate.getYear() && month == contractDate.getMonthValue()) {
                sum += hourContract.totalValue();
            }
        }
        return sum;
    }
}
